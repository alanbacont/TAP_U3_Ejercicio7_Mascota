
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class Pinguino {
    public int manos=415;
    public int ojos=360;
    public int pata1=495;
    public int pata2=495;
    public HiloPinguino p=new HiloPinguino(this);
    public int caminar=0;
    public int aumentar=0;    
    public Pinguino(){
    p.start();
    }
    
    public void PintarPinguino(Graphics g2){
    //Cuerpo y  cabeza
        g2.setColor(Color.BLACK);
        g2.fillOval(450, 400, 80, 100);
        g2.fillOval(460, 365, 60, 50);
        //Manos
        g2.fillOval(415, manos, 80, 15);
        g2.fillOval(485, manos, 80, 15);
        //cuerpo blanco
        g2.setColor(Color.WHITE);
        g2.fillOval(470, 380, 20, 20);
        g2.fillOval(490, 380, 20, 20);
        g2.fillOval(475, 385, 30, 25);
        g2.fillOval(458, 405, 65, 85);
        //patas
        g2.setColor(Color.ORANGE);
        g2.fillOval(490, pata2, 35, 10);
        g2.fillOval(455, pata1, 35, 10);
        //Nariz
        g2.fillOval(488, 396, 5, 10);
        //ojos
        g2.setColor(Color.BLACK);
        g2.fillArc(475, 385, 10, 10, 360, ojos);
        g2.fillArc(495, 385, 10, 10, 360, ojos);
    
    }
    
    public void PintarPinguinoJuego(Graphics g2){
    //Cuerpo y  cabeza
        if(caminar>=0&&caminar<50){
        g2.setColor(Color.BLACK);
        g2.fillOval(450, 400, 80, 100);
        g2.fillOval(460, 365, 60, 50);
        //Manos
        g2.fillOval(415, manos, 80, 15);
        g2.fillOval(485, manos, 80, 15);
        //cuerpo blanco
        g2.setColor(Color.WHITE);
        g2.fillOval(470, 380, 20, 20);
        g2.fillOval(490, 380, 20, 20);
        g2.fillOval(475, 385, 30, 25);
        g2.fillOval(458, 405, 65, 85);
        //patas
        g2.setColor(Color.ORANGE);
        g2.fillOval(490, pata2, 35, 10);
        g2.fillOval(455, pata1, 35, 10);
        //Nariz
        g2.fillOval(488, 396, 5, 10);
        //ojos
        g2.setColor(Color.BLACK);
        g2.fillArc(475, 385, 10, 10, 360, ojos);
        g2.fillArc(495, 385, 10, 10, 360, ojos);
        }else{
        if (caminar>=50&&caminar<=250) {
            
        g2.setColor(Color.black);
        g2.fillOval(450+aumentar, 400, 80, 100);
        g2.fillOval(460+aumentar, 365, 60, 50);
        g2.setColor(Color.ORANGE);
        g2.fillOval(513+aumentar, 396, 13, 5);
        g2.setColor(Color.white);
        g2.fillArc(497+aumentar, 385, 10, 10, 360, ojos);
        g2.setColor(Color.ORANGE);
        g2.fillOval(490+aumentar, pata2, 35, 10); 
        }else{if (caminar>=250&&caminar<=450) {
                g2.setColor(Color.black);
        g2.fillOval(450+aumentar, 400, 80, 100);
        g2.fillOval(460+aumentar, 365, 60, 50);
        g2.setColor(Color.ORANGE);
        g2.fillOval(453+aumentar, 396, 13, 5);
        g2.setColor(Color.white);
        g2.fillArc(473+aumentar, 385, 10, 10, 360, ojos);
        g2.setColor(Color.ORANGE);
        g2.fillOval(455+aumentar, pata1, 35, 10); 
            }
        }
                  
        }
        
    }
}
