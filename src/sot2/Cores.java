/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sot2;

import java.awt.List;
import java.util.ArrayList;


public class Cores {
 protected int red;
 protected int green;
 protected int blue;
 ArrayList<Cores> cores = new ArrayList<>();
 
 public  ArrayList<Cores> getPalletacores(){
 for(int i =0; i<10;i++){
     cores.add(new Cores());
 }
 cores.get(0).red = 4;
 cores.get(0).green = 48;
 cores.get(0).blue = 255;
 
 cores.get(1).red = 233;
 cores.get(1).green = 0;
 cores.get(1).blue = 40;
 
 cores.get(2).red = 0;
 cores.get(2).green = 0;
 cores.get(2).blue = 0;
 
 cores.get(3).red = 106;
 cores.get(3).green = 182;
 cores.get(3).blue = 73;
 
 cores.get(4).red = 140;
 cores.get(4).green = 140;
 cores.get(4).blue = 255;
 
 cores.get(5).red = 255;
 cores.get(5).green = 255;
 cores.get(5).blue = 125;
 
 cores.get(6).red = 131;
 cores.get(6).green = 199;
 cores.get(6).blue = 250;
 
 cores.get(7).red = 128;
 cores.get(7).green = 0;
 cores.get(7).blue = 0;
 
 cores.get(8).red = 213;
 cores.get(8).green = 206;
 cores.get(8).blue = 0;
 
 cores.get(9).red = 64;
 cores.get(9).green = 128;
 cores.get(9).blue = 128;
 
 return cores;
 }
 
 
 
}
