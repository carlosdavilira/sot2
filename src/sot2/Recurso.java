/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

import java.awt.Button;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Carlos David
 */
public class Recurso {

private String nomeRecurso;
private Integer id;
private Semaphore semaforo;
private Integer x;
private Integer y;
public int cor[] = new int[3]; 
private ArrayList<Processo> listaBloqueados = new ArrayList<>();
private int idProcessoBloqueador;
public Button botao;

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

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public int[] getCor() {
        return this.cor;
    }

    public void setCor(int[] cor) {
        this.cor = cor;
    }

    public Semaphore getSemaforo() {
        return semaforo;
    }

    public ArrayList<Processo> getListaBloqueados() {
        return listaBloqueados;
    }

    public void setListaBloqueados(ArrayList<Processo> listaBloqueados) {
        this.listaBloqueados = listaBloqueados;
    }

    public int getIdProcessoBloqueador() {
        return idProcessoBloqueador;
    }

    public void setIdProcessoBloqueador(int idProcessoBloqueador) {
        this.idProcessoBloqueador = idProcessoBloqueador;
    }
    
    
    
    



    
}
