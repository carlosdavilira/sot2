/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

/**
 *
 * @author Carlos David
 */
public class Processo implements Runnable{
    private Integer x;
    private Integer y;
    private Integer id;
    private Integer deltaTs;
    private Integer deltaTu;
    private int[] cor = new int[3];
    
    
    
    

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getId() {
        return id;
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

    public void setId(Integer id) {
        this.id = id;
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

    public void setCor(int red,int green, int blue) {
        this.cor[0] = red;
        this.cor[1] = green;
        this.cor[2] = blue;
    }

   
    
    
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
