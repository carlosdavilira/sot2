/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questaoh2o2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Davi
 */
public class Hidrogenio extends Thread{
    
    QuestaoH2O2 q;
    
    Hidrogenio(QuestaoH2O2 questaoH2O2) {
       
       this.q = questaoH2O2;
    }
    
    public void FormaMolecula(){
        H2O2 h2o2 = new H2O2("Hidrogenio threadId "+this.getId());
        
    }
    
    @Override
    public void run(){
         try {
             q.mutex.acquire();
             q.hidrogenio = q.hidrogenio.intValue()+1;
             if(q.hidrogenio >= 2 && q.oxigenio >= 2){
                q.hidrogenio = q.hidrogenio-2;
                q.oxigenio = q.oxigenio-2;
                q.mutex.release();
                q.OXI.release();
                q.OXI.release();
                q.HID.release();
                q.HID.release(); 
             }
             else
             {
                q.mutex.release();             
             }
          q.HID.acquire();
          FormaMolecula();
          
             
             
         } catch (InterruptedException ex) {
             Logger.getLogger(Hidrogenio.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
}
