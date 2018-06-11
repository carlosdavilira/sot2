/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Carlos David
 */
public class SO extends Thread{
    private TelaPrincipal refTela;
    private int tempo;
    
    
    public SO (TelaPrincipal refPrincipal, int tempo){
    this.refTela = refPrincipal;
    this.tempo = tempo;
    }
   
    public void DetectarDeadlock(){
   
   
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
    
  @Override
public void run(){

    while(true){
        Mudarcor(1);
        this.ContaTempo(tempo);
        Mudarcor(2);
        DetectarDeadlock();
    
    }

}  
}
