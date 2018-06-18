/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questaoh2o2;

/**
 *
 * @author Davi
 */
public class H2O2 extends Thread{
    
    public H2O2(String texto){
           System.out.println(texto+" gerou H2O2: id da Thread gerada"+this.getId());
    }
    
}
