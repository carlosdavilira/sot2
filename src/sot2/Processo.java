/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

import com.sun.xml.internal.ws.client.ContentNegotiation;
import java.awt.Button;
import java.awt.Graphics;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Carlos David
 */
public class Processo extends Thread{ //implements Runnable{
    private Integer x;
    private Integer y;
    private Integer idProcesso;
    private Integer deltaTs;
    private Integer deltaTu;
    private int[] cor = new int[3];
    private ArrayList<Recurso> recursosUsando;
    private boolean  vivo = true;
    private ArrayList<Recurso> refListRecurso;
    private JTextArea areaTextoLog;
    private TelaPrincipal refTela;
    public String estado = "Rodando";
    public String estadoLiberado = "Sim";
    public Semaphore mutex = new Semaphore(1);
    public Semaphore mutexDesenho;// = new Semaphore(1);
    public Semaphore mutexRecurso = new Semaphore(1);
    public Button botao;
    
    public Processo(ArrayList listRecurso, JTextArea refLog, TelaPrincipal refTela, Semaphore mutex, Semaphore mutexDesenho){
        this.refListRecurso = listRecurso;
        this.areaTextoLog = refLog;
        this.refTela = refTela;
        this.recursosUsando = new ArrayList<>();
        this.mutex = mutex;
        this.mutexDesenho = mutexDesenho;
    }
    
    
    
    

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getIdProcesso() {
        return idProcesso;
    }

    public Integer getDeltaTs() {
        return deltaTs;
    }

    public Integer getDeltaTu() {
        return deltaTu;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setIdProcesso(Integer id) {
        this.idProcesso = id;
    }

    public void setDeltaTs(Integer deltaTs) {
        this.deltaTs = deltaTs;
    }

    public void setDeltaTu(Integer deltaTu) {
        this.deltaTu = deltaTu;
    }

    public int[] getCor() {
        return cor;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public ArrayList<Recurso> getRefListRecurso() {
        return refListRecurso;
    }

    public TelaPrincipal getRefTela() {
        return refTela;
    }

    public ArrayList<Recurso> getRecursosUsando() {
        return recursosUsando;
    }
    
    

    public void setCor(int red,int green, int blue) {
        this.cor[0] = red;
        this.cor[1] = green;
        this.cor[2] = blue;
    }

    public void UtilizarRecurso(Recurso r) throws InterruptedException{
       if(this.recursosUsando.contains(r) == false){
           
        
     /*   if(r.getSemaforo().availablePermits() <= 0){
            int[] corBloqueado = {0,0,0};
            
            this.mutex.acquire();
                areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" tentando usar o recurso "+r.getNomeRecurso());
                this.estado = "Bloqueado";
                areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" "+this.estado+" pelo recurso "+r.getNomeRecurso());
            this.mutex.release();
            
            this.mutexDesenho.acquire();
                    refTela.DesenharReta(this.getX()+15, this.getY()+30, r.getX()+15, r.getY(), corBloqueado);
                    getRefTela().DesenharCirculo(this.getX(), this.getY(), corBloqueado);           
                    r.getListaBloqueados().add(this); //adiciona processo bloqueado a lista de bloqueados do recurso
            this.mutexDesenho.release();
             
             r.getSemaforo().acquire();           
            
            this.mutex.acquire();
                areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" desbloqueado");
            this.mutex.release();
           // r.getSemaforo().release();
        } */
       // else{  COMEÇO DO ELSE
        int[] corBloqueado = {0,0,0};
        this.mutexDesenho.acquire();
                    refTela.DesenharReta(this.getX()+15, this.getY()+30, r.getX()+15, r.getY(), corBloqueado);
                    getRefTela().DesenharCirculo(this.getX(), this.getY(), corBloqueado);           
                    r.getListaBloqueados().add(this); //adiciona processo bloqueado a lista de bloqueados do recurso
        this.mutexDesenho.release();
        
        if(r.getSemaforo().availablePermits() <= 0){            
            
            this.mutex.acquire();
                areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" tentando usar o recurso "+r.getNomeRecurso());
                this.estado = "Bloqueado";
                areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" "+this.estado+" pelo recurso "+r.getNomeRecurso());
            this.mutex.release();            
          
        }    
        
       
       
        r.getSemaforo().acquire();
       
        this.mutexDesenho.acquire();
                    refTela.DesenharReta(this.getX()+15, this.getY()+30, r.getX()+15, r.getY(), this.getCor());
                    getRefTela().DesenharCirculo(this.getX(), this.getY(), this.getCor());           
                    r.getListaBloqueados().add(this); //adiciona processo bloqueado a lista de bloqueados do recurso
        this.mutexDesenho.release();
        
        this.mutex.acquire();
                this.estado = "Rodando";
                areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" "+this.estado);
        this.mutex.release();
        
      // this.mutexDesenho.acquire();
               // refTela.DesenharReta(this.getX()+15, this.getY()+30, r.getX()+15, r.getY(), this.cor);
                //getRefTela().DesenharCirculo(r.getX(), r.getY(), this.getCor());
               // this.estado = "Rodando";
       // this.mutexDesenho.release();
        
        this.mutex.acquire();
           // this.estado = "Bloqueado";
            this.recursosUsando.add(r);
            r.setIdProcessoBloqueador(this.getIdProcesso());
            areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" tentando usar o recurso "+r.getNomeRecurso());
            areaTextoLog.setText(areaTextoLog.getText()+"\n Processo "+this.getIdProcesso()+" utilizando o recurso "+r.getNomeRecurso());
        this.mutex.release();
        
        this.mutexDesenho.acquire();
             refTela.DesenharReta(this.getX()+15, this.getY()+30, r.getX()+15, r.getY(), this.cor);
             getRefTela().DesenharQuadrado(r.getX(), r.getY(), this.getCor());
        this.mutexDesenho.release();
        }
        
     //  } CHAVE DO ELSE
     
    }
    public void LiberarRecurso(Recurso r ) throws InterruptedException{
      
       if(this.recursosUsando.contains(r)){
          
           
           
           r.getSemaforo().release();
           mutexDesenho.acquire();
                int cor[] = {240,240,240};
                refTela.DesenharQuadrado(r.getX(), r.getY(), cor);
                this.getRefTela().DesenharReta(this.getX()+15,this.getY()+30,r.getX()+15,r.getY(),cor);
           mutexDesenho.release();
           
           this.recursosUsando.remove(r);
           this.mutex.acquire();                
                r.setIdProcessoBloqueador(0);
                areaTextoLog.setText(areaTextoLog.getText()+"\n O processo "+this.getIdProcesso()+" liberou o recurso "+r.getNomeRecurso());
           this.mutex.release();
           mutexDesenho.acquire();
           for(Processo p : r.getListaBloqueados()){                               
                refTela.DesenharCirculo(p.getX(), p.getY(), p.getCor());
                this.getRefTela().DesenharReta(p.getX()+15,p.getY()+30,r.getX()+15,r.getY(),cor);               
            }
           mutexDesenho.release();
       } 
        
    
    }
    
   
    public int SortearRecurso(){
    Random rand = new Random();
    int indeceRecursoSorteado = rand.nextInt(this.refListRecurso.size());
     if(this.recursosUsando == null)
            return indeceRecursoSorteado;
   for(int i = 0; i < this.recursosUsando.size(); i++){
        if(this.recursosUsando.get(i) == null)
            return indeceRecursoSorteado;
        //Para a primeira iteração, considera-se o indice 0 como o primeiro
        else if(this.refListRecurso.get(indeceRecursoSorteado).equals(this.recursosUsando.get(i))){
           // se for igual o programa ira ignorar, pois o processo ja esta de posse do recurso
          indeceRecursoSorteado = rand.nextInt(this.refListRecurso.size());
       }else{
           return indeceRecursoSorteado;
       }
   }
   return 0;
   }
    
    public boolean ContaTempo(int quantidadeSegundos){
            Date date = new Date();
            DateFormat formato = new SimpleDateFormat("ss");
            String formattedDate = formato.format(date);    
            Integer tempoFD = (Integer.parseInt(formattedDate));
            Integer tempoFinal = tempoFD+quantidadeSegundos;
            while(tempoFD < tempoFinal){
                formattedDate = formato.format(new Date());
                tempoFD = (Integer.parseInt(formattedDate));
            }
        return true;
    }
  public boolean BuscaRecurso(ArrayList<Recurso> lista, Recurso r){
      for(Recurso re : lista){
          if(re.getId() == r.getId())
              return true;
      }
  return false;
  }  
    @Override
    public void run() {
       
        while(this.vivo){                      
            
            try {
                Recurso recurso = null; 
                if(this.getRecursosUsando().size() < this.refListRecurso.size())
               {
               
                mutexRecurso.acquire();
                    recurso =  this.refListRecurso.get(SortearRecurso());
                mutexRecurso.release();
                
                if((this.getRecursosUsando().contains(recurso))){
                   System.out.println("Processo "+this.getIdProcesso()+" vai entrar no LiberarRecurso");
                    this.LiberarRecurso(recurso);
               }
               else if(this.getRecursosUsando().contains(recurso) == false){
                   ContaTempo(this.getDeltaTs()); 
                   this.UtilizarRecurso(recurso);  // utiliza recurso 
                    System.out.println("Processo "+this.getIdProcesso()+" vai entrar no UtilizarRecurso");
               }             
             }
                else{
                if((this.getRecursosUsando().contains(recurso))){
                   System.out.println("Processo "+this.getIdProcesso()+" vai entrar no LiberarRecurso");
                   ContaTempo(this.getDeltaTu()); 
                   this.LiberarRecurso(recurso);
               }
               }
               } catch (InterruptedException ex) {
                Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
            }
               
                //long tempoInicial = (System.currentTimeMillis());
               // while(System.currentTimeMillis()  > ((this.getDeltaTs()*1000) + tempoInicial)){
              // ContaTempo(this.getDeltaTs());
               
               //Threaad.sleep(deltaTs * 1000);
               //if(this.getRecursosUsando().contains(recurso)){
               
   /*            if((this.getRecursosUsando().contains(recurso))){
                   System.out.println("Processo "+this.getIdProcesso()+" vai entrar no LiberarRecurso");
                   //mutex.acquire();
                   //System.out.println("Processo "+this.getIdProcesso()+" usando o recurso "+recurso.getNomeRecurso());
                   //mutex.release();
                   //ContaTempo(this.getDeltaTu());
                   //mutex.acquire();
                   //System.out.println("Processo "+this.getIdProcesso()+" parou de usar o recurso "+recurso.getNomeRecurso());
                    this.LiberarRecurso(recurso);
               }
               //else if(!this.getRecursosUsando().contains(recurso)){
               else if(this.getRecursosUsando().contains(recurso) == false){
                    this.UtilizarRecurso(recurso);  // utiliza recurso 
                    System.out.println("Processo "+this.getIdProcesso()+" vai entrar no UtilizarRecurso");
                     }                
                
               // tempoInicial = (int)System.currentTimeMillis();
                
               // while(System.currentTimeMillis() > ((this.getDeltaTu()*1000)+tempoInicial)){
            } catch (InterruptedException ex) {
                Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
            }          
        */
        }
System.out.println("Processo "+this.getIdProcesso()+ " saiu do Loop");
    }
    
    
    
    
    
}
