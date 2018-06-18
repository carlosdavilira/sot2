/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questaoh2o2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Davi
 */
public class QuestaoH2O2 {

   public Semaphore mutex = new Semaphore(1);
   public Semaphore OXI = new Semaphore(0);
   public Semaphore HID = new Semaphore(0);
   public Integer oxigenio = new Integer(0);
   public  Integer hidrogenio = new Integer(0);
  
   
   public static void main(String args[]){
       new QuestaoH2O2().IniciarSimulacao(2);
       
   
   }
   
   public void IniciarSimulacao(int quantidadeIteracoes){
       for(int i = 0; i < quantidadeIteracoes; i++){
           Hidrogenio hidro = new Hidrogenio(this);
            hidro.start();
            Oxigenio oxi = new Oxigenio(this);
            oxi.start();
            
       }
   
   }

    
}
  