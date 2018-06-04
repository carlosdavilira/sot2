/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Carlos David
 */
public class Recurso {

private String nomeRecurso;
private Integer id;
private Semaphore semaforo;

public Recurso(){
    semaforo = new Semaphore(1);
}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNomeRecurso() {
        return nomeRecurso;
    }

    public void setNomeRecurso(String nomeRecurso) {
        this.nomeRecurso = nomeRecurso;
    }
    
    public void UsarRecurso() throws InterruptedException{
        this.semaforo.acquire();
    }
    public void LiberarRecurso(){
        this.semaforo.release();
    }



    
}
