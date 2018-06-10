/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

import java.util.ArrayList;
import java.util.Random;
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

    
    public Processo(ArrayList listRecurso, JTextArea refLog, TelaPrincipal refTela){
        this.refListRecurso = listRecurso;
        this.areaTextoLog = refLog;
        this.refTela = refTela;
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
    
    

    public void setCor(int red,int green, int blue) {
        this.cor[0] = red;
        this.cor[1] = green;
        this.cor[2] = blue;
    }

    public void UtilizarRecurso(Recurso r) throws InterruptedException{
        if(r.getSemaforo().availablePermits() == 0){            
            r.getListaBloqueados().add(this); //Adiciona processo a lista de bloqueados do recurso
            areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Processo: "+this.getIdProcesso()+" está Bloqueado!");
            for(Processo processo : r.getListaBloqueados()){
                System.out.println("Processo: "+processo.getIdProcesso()+" está Bloqueado!");
            }
        }
        //r.UsarRecurso();
        r.getSemaforo().acquire();
        this.getRefTela().DesenharReta(this.getX()+15,this.getY()+30,r.getX()+15,r.getY(),this.getCor());
        
        areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Processo: "+this.getIdProcesso()+" está usando o Recurso: "+r.getId());
        System.out.println("Processo: "+this.getIdProcesso()+" está usando o Recurso: "+r.getId());
    }
    public void LiberarRecurso(Recurso r ){
        if(r.getListaBloqueados() == null ){}
        else if(r.getListaBloqueados().size() > 0)    
            r.getListaBloqueados().clear();
        r.LiberarRecurso();
        areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Processo: "+this.getIdProcesso()+" liberou o Recurso: "+r.getId());
         System.out.println(this.getIdProcesso()+" liberou o Recurso: "+r.getId());
        this.getRefTela().DesenharReta(this.getX()+15,this.getY()+30,r.getX()+15,r.getY(),null);
        
    
    }
    
   public int SortearRecurso(){
  
   for(int i = 0; i< this.recursosUsando.size(); i++){
       Random rand = new Random();
       int indeceRecursoSorteado = rand.nextInt(this.refListRecurso.size());
       if(this.refListRecurso.get(indeceRecursoSorteado).equals(this.recursosUsando.get(i))){
           // se for igual o programa ira ignorar, pois o processo ja esta de posse do recurso
       }else{
           return indeceRecursoSorteado;
       }
   }
   return 0;
   }
    
    @Override
    public void run() {
       
        while(this.vivo){
            
            
            Recurso recurso =  this.refListRecurso.get(SortearRecurso());
            
            try {
                
                Thread.sleep(deltaTs * 1000);
                this.UtilizarRecurso(recurso);  // utiliza recurso          
                
                this.LiberarRecurso(recurso);
            } catch (InterruptedException ex) {
                Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
            }          
        
        }

    }
    
    
    
}
