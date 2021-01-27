
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
public class Borrego {
    public int contador=0;
    public int cabeza=400;
    public int cola=400;
    public int parpadeo=180;
    public int masticando=440;
    public HiloBorrego h=new HiloBorrego(this);
    
    public Borrego(){
    h.start();
    }
    
    
    public void pintarBorrego(Graphics g2){
    
    //Cuerpo
        g2.setColor(Color.WHITE);
        g2.fillOval(100, 400, 50, 50);
        g2.fillOval(120, 380, 50, 50);
        g2.fillOval(120, 420, 50, 50);
        g2.fillOval(130, 380, 90, 90);
        g2.fillOval(180, 420, 50, 50);
        g2.fillOval(180, 380, 50, 50);
        g2.fillOval(200, 400, 50, 50);
        g2.fillOval(140, 445, 20, 55);
        g2.fillOval(185, 445, 20, 55);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillOval(140, 488, 20, 12);
        g2.fillOval(185, 488, 20, 12);
        //Cola
        g2.setColor(Color.WHITE);
        g2.fillOval(80, cola, 35, 20);
        //Cabeza 
        g2.setColor(new Color(255,204,153));
        if(contador>=0&&contador<85){
        g2.fillOval(220, cabeza, 60, 40);
        g2.fillOval(255, cabeza+20, 30, 20);
        g2.setColor(Color.WHITE);
        g2.fillOval(220, cabeza-10, 25, 20);
        g2.fillOval(235, cabeza-10, 25, 20);
        g2.fillOval(250, cabeza-10, 25, 20);
        g2.fillOval(260, cabeza-3, 25, 20);
        g2.fillOval(260, cabeza+20, 10, 10);
        g2.setColor(Color.BLACK);
        g2.fillArc(260, cabeza+20, 10, 10, 0, 180);
        g2.fillOval(265, cabeza+25, 5, 5);
        g2.drawLine(275, cabeza+32, 280, cabeza+35);
        }
        //Cabezadefrente
        if(contador>=85&&contador<120){
        g2.fillOval(220, 390, 40, 60);
        g2.setColor(Color.WHITE);
        g2.fillOval(222, 382, 20, 20);
        g2.fillOval(212, 388, 20, 20);
        g2.fillOval(233, 382, 20, 20);
        g2.fillOval(242, 388, 20, 20);
        //orejas
        g2.setColor(Color.black);
        g2.fillOval(200, 400, 25, 10);
        g2.fillOval(255, 400, 25, 10);
        //ojos
        g2.setColor(Color.WHITE);
        g2.fillOval(225, 410, 10, 10);
        g2.fillOval(245, 410, 10, 10);
        
        g2.setColor(Color.BLACK);
        g2.fillArc(225, 410, 10, 10, 0, parpadeo);
        g2.fillArc(245, 410, 10, 10, 0, parpadeo);
        g2.fillOval(229, 416, 2, 2);
        g2.fillOval(249, 416, 2, 2);
        //marcas
        g2.drawLine(240, 440,240,449);
        g2.drawArc(235, 430, 10, 10, 180, 200);
        g2.drawArc(233, masticando, 15, 8, 180, 200);
        }
        }
    public void pintarBorregoJuego(Graphics g2){
    //Cuerpo
        g2.setColor(Color.WHITE);
        g2.fillOval(200, 470, 50, 50);
        g2.fillOval(220, 450, 50, 50);
        g2.fillOval(220, 490, 50, 50);
        g2.fillOval(230, 450, 90, 90);
        g2.fillOval(280, 490, 50, 50);
        g2.fillOval(280, 450, 50, 50);
        g2.fillOval(300, 470, 50, 50);
        g2.fillOval(240, 515, 20, 55);
        g2.fillOval(285, 515, 20, 55);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillOval(240, 558, 20, 12);
        g2.fillOval(285, 558, 20, 12);
        //Cola
        g2.setColor(Color.WHITE);
        g2.fillOval(180, 470, 35, 20);
        //Cabeza 
        g2.setColor(new Color(255,204,153));
        if(contador>=0&&contador<85){
        g2.fillOval(320, 470, 60, 40);
        g2.fillOval(355, 470+20, 30, 20);
        g2.setColor(Color.WHITE);
        g2.fillOval(320, 470-10, 25, 20);
        g2.fillOval(335, 470-10, 25, 20);
        g2.fillOval(350, 470-10, 25, 20);
        g2.fillOval(360, 470-3, 25, 20);
        g2.fillOval(360, 470+20, 10, 10);
        g2.setColor(Color.BLACK);
        g2.fillArc(360, 470+20, 10, 10, 0, 180);
        g2.fillOval(365, 470+25, 5, 5);
        }
        //Cabezadefrente
        if(contador>=85&&contador<120){
        g2.fillOval(320, 460, 40, 60);
        g2.setColor(Color.WHITE);
        g2.fillOval(322, 452, 20, 20);
        g2.fillOval(312, 458, 20, 20);
        g2.fillOval(333, 452, 20, 20);
        g2.fillOval(342, 458, 20, 20);
        //orejas
        g2.setColor(Color.black);
        g2.fillOval(300, 470, 25, 10);
        g2.fillOval(355, 470, 25, 10);
        //ojos
        g2.setColor(Color.WHITE);
        g2.fillOval(325, 480, 10, 10);
        g2.fillOval(345, 480, 10, 10);
        
        g2.setColor(Color.BLACK);
        g2.fillArc(325, 480, 10, 10, 0, parpadeo);
        g2.fillArc(345, 480, 10, 10, 0, parpadeo);
        g2.fillOval(329, 486, 2, 2);
        g2.fillOval(349, 486, 2, 2);
        //marcas
        g2.drawArc(335, 500, 10, 10, 180, 200);
        g2.drawArc(333, 510, 15, 8, 180, 200);
    
        }
    }
    
}
