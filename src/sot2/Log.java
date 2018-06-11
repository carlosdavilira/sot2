/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
/**
 *
 * @author Davi
 */
public class Log extends Thread{
 
  JTextArea areaTextoLog;
  ArrayList<Processo> listProcessos;
  ArrayList<Recurso> listRecursos;

public Log(JTextArea log,ArrayList<Processo> listProcessos,ArrayList<Recurso> listRecursos){
    this.areaTextoLog = log;
    this.listProcessos = listProcessos;
    this.listRecursos = listRecursos;
} 
public void MostrarLog(){
    this.areaTextoLog.setText(areaTextoLog.getText()+"\n ---------------");
for(Processo processo : listProcessos){    
   
    for(Recurso recurso : processo.getRecursosUsando()){
        this.areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Processo: "+processo.getIdProcesso()+" está solicitando o Recurso: "+recurso.getId());
        this.areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Processo: "+processo.getIdProcesso()+" está:"+processo.estadoLiberado  );   
        this.areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Processo: "+processo.getIdProcesso()+" está:"+processo.estado  );   
        
    }
}

for(Recurso recurso : listRecursos){

    for(Processo processo : recurso.getListaBloqueados()){
        this.areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Recurso: "+recurso.getNomeRecurso()+" está bloqueando o processo "+processo.getIdProcesso());
    }
}
}

@Override
public void run(){
    while(true){
        try {
            Thread.sleep(200);
            MostrarLog();
        } catch (InterruptedException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

}
}
