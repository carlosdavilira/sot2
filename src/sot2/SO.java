/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextArea;

/**
 *
 * @author Carlos David
 */
public class SO extends Thread{
    private TelaPrincipal refTela;
    private int tempo;
    private JTextArea areaDeadLock;
    private ArrayList<Processo> listaProcessos;
    private ArrayList<Recurso> listaRecursos;
    private ArrayList<Recurso> listaRecursosbloqueados;
    
    
    
    
    public SO (TelaPrincipal refPrincipal, int tempo,JTextArea areaDeadLock,ArrayList<Processo> listaProcessos,ArrayList<Recurso> listaRecursos){
    this.refTela = refPrincipal;
    this.tempo = tempo;
    this.areaDeadLock = areaDeadLock;
    this.listaProcessos = listaProcessos;
    this.listaRecursos = listaRecursos;
    
    }
   
    public String DetectarDeadlock(){
        for(int i=0; i < listaProcessos.size()-2; i++){
            for(int j=0; j < listaRecursos.size()-2; j++){
                if(listaRecursos.get(j).getListaBloqueados().size()-2 > 0){
                for(int k=0; k < listaRecursos.get(j).getListaBloqueados().size()-2; k++){                
                    if(listaProcessos.get(i).getIdProcesso() == (listaRecursos.get(j).getListaBloqueados().get(k).getIdProcesso())){
                    
                        if(listaRecursos.get(i).getIdProcessoBloqueador()> 0){
                            for(int l=0; l < listaProcessos.size()-2; l++){
                                if((listaRecursos.get(i).getIdProcessoBloqueador()) == listaProcessos.get(l).getIdProcesso()){
                                    if(listaProcessos.get(l).estado.equals("Bloqueado")){
                                        return "Deadlock entre o processo "+listaProcessos.get(i).getIdProcesso()+" e "+listaRecursos.get(i).getIdProcessoBloqueador();
                                    }
                                
                                }
                            }
                            
                        }
                        
                        }
                    
                    }
                    
                }
                }
            }
        String bloqueados ="";
        int cont = 0;
         for(int i = 0; i < listaProcessos.size();i++){
                if(listaProcessos.get(i).estado == "Bloqueado"){
                    bloqueados = bloqueados+" "+listaProcessos.get(i).getIdProcesso();
                    cont++;
                }
                if(cont == listaProcessos.size())
                    return "Deadlock Total";
            }
         bloqueados ="";
         for(int i = 0; i < listaProcessos.size();i++){
                if(listaProcessos.get(i).estado == "Bloqueado")
                    bloqueados = bloqueados+" "+listaProcessos.get(i).getIdProcesso();
            }
         
         if(bloqueados.length() > 2){
            return "Processos bloqueados: "+bloqueados; 
         }
        return null;
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

public void Mudarcor(int codCor){
    if(codCor == 1){ //preto
        int[] cor = new int[3];
            cor[0] = 233;
            cor[1] = 0;
            cor[1] = 40;
            refTela.DesenharCirculo(735, 580, cor);
        }
    else if(codCor == 2){ //verde
        int[] cor = new int[3];
            cor[0] = 4;
            cor[1] = 48;
            cor[1] = 255;
            refTela.DesenharCirculo(735, 580, cor);
    
    }
}  

public void DeadLock(ArrayList<Recurso> listaRecursos){
for(int i = 0; i < listaRecursos.size(); i++){
   if(VerificarDeakLock(i,listaRecursos.get(i)))
       System.out.println("Deadklock encontrado!");
}
}
private boolean VerificarDeakLock(int i,Recurso recurso) {
   int chave = recurso.getIdProcessoBloqueador();
  /*  for(int j = 0; listaRecursos.size(); j++){
        if(j == i){}
        else
        {
            if(chave < listaRecursos.get(j).getListaBloqueados().contains(j))
        }
    }*/
    return false;
    } 
 
  @Override
public void run(){

    while(true){
        Mudarcor(1);
        this.ContaTempo(tempo);
        Mudarcor(2);
        if(DetectarDeadlock() != null)
            areaDeadLock.setText(areaDeadLock.getText()+"\n"+DetectarDeadlock());
    
    }

}  

    
}
