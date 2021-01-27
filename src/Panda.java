
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
public class Panda {
    public int mano=385;
    public int mano2=390;
    public int mano3=395;
    public int mano4=400;
    public int mano5=405;
    public int ojos=360;
    
    public boolean saludar=false;
    public HiloPanda h=new HiloPanda(this);
    
    public Panda(){
    h.start();
    }
    
    public void dibujarPanda(Graphics g2){
        
    //Panda
        //Patas
        g2.setColor(Color.BLACK);
        g2.fillOval(750, 460, 20, 50);
        g2.fillOval(790, 460, 20, 50);
        //Manos
        //Izq
        if(saludar==false){
        g2.fillOval(737, 410, 30, 30);
        g2.fillOval(730, 420, 20, 50);
        //Der
        g2.fillOval(793, 410, 30, 30);
        g2.fillOval(810, 420, 20, 50);
        }
        if(saludar==true){
        g2.fillOval(710, mano, 20, 20);
        g2.fillOval(715, mano2, 20, 20);
        g2.fillOval(720, mano3, 20, 20);
        g2.fillOval(725, mano4, 20, 20);
        g2.fillOval(730, mano5, 20, 20);
        g2.fillOval(735, 410, 20, 20);
        g2.fillOval(740, 415, 30, 30);
        //izq
        g2.fillOval(793, 410, 30, 30);
        g2.fillOval(810, 420, 20, 50);
        }
        //Cuerpo
        g2.setColor(Color.WHITE);
        g2.fillOval(740, 400, 80, 95);
        g2.setColor(Color.BLACK);
        g2.fillArc(741, 400, 77, 70, 0, 180);
        //Orejas
        g2.setColor(Color.BLACK);
        g2.fillOval(740, 346, 25, 25);
        g2.fillOval(797, 346, 25, 25);
        //Cabeza
        g2.setColor(Color.WHITE);
        g2.fillOval(742, 350, 78, 70);
        //ojos
        g2.setColor(Color.pink);
        g2.fillOval(750, 390, 20, 20);
        g2.fillOval(790, 390, 20, 20);
        g2.setColor(Color.BLACK);
        g2.fillOval(753, 380, 20, 20);
        g2.fillOval(755, 375, 20, 25);
        g2.fillOval(787, 380, 20, 20);
        g2.fillOval(785, 375, 20, 25);
        g2.setColor(Color.WHITE);
        g2.fillArc(765, 385, 5, 5, 0, ojos);
        g2.fillArc(790, 385, 5, 5, 0, ojos);
        //nariz
        g2.setColor(Color.BLACK);
        g2.fillOval(775, 390, 10, 8);
        //boca
        g2.drawArc(773, 395, 7, 5, 180, 180);
        g2.drawArc(779, 395, 7, 5, 180, 180);
        
        
    }
    
    public void dibujarPandaJuego(Graphics g2){
        
    //Panda
        //Patas
        g2.setColor(Color.BLACK);
        g2.fillOval(550, 460, 20, 50);
        g2.fillOval(590, 460, 20, 50);
        //Manos
        //Izq
        if(saludar==false){
        g2.fillOval(537, 410, 30, 30);
        g2.fillOval(530, 420, 20, 50);
        //Der
        g2.fillOval(593, 410, 30, 30);
        g2.fillOval(610, 420, 20, 50);
        }
        if(saludar==true){
        g2.fillOval(510, mano, 20, 20);
        g2.fillOval(515, mano2, 20, 20);
        g2.fillOval(520, mano3, 20, 20);
        g2.fillOval(525, mano4, 20, 20);
        g2.fillOval(530, mano5, 20, 20);
        g2.fillOval(535, 410, 20, 20);
        g2.fillOval(540, 415, 30, 30);
        //izq
        g2.fillOval(593, 410, 30, 30);
        g2.fillOval(610, 420, 20, 50);
        }
        //Cuerpo
        g2.setColor(Color.WHITE);
        g2.fillOval(540, 400, 80, 95);
        g2.setColor(Color.BLACK);
        g2.fillArc(541, 400, 77, 70, 0, 180);
        //Orejas
        g2.setColor(Color.BLACK);
        g2.fillOval(540, 346, 25, 25);
        g2.fillOval(597, 346, 25, 25);
        //Cabeza
        g2.setColor(Color.WHITE);
        g2.fillOval(542, 350, 78, 70);
        //ojos
        g2.setColor(Color.pink);
        g2.fillOval(550, 390, 20, 20);
        g2.fillOval(590, 390, 20, 20);
        g2.setColor(Color.BLACK);
        g2.fillOval(553, 380, 20, 20);
        g2.fillOval(555, 375, 20, 25);
        g2.fillOval(587, 380, 20, 20);
        g2.fillOval(585, 375, 20, 25);
        g2.setColor(Color.WHITE);
        g2.fillArc(565, 385, 5, 5, 0, ojos);
        g2.fillArc(590, 385, 5, 5, 0, ojos);
        //nariz
        g2.setColor(Color.BLACK);
        g2.fillOval(575, 390, 10, 8);
        //boca
        g2.drawArc(573, 395, 7, 5, 180, 180);
        g2.drawArc(579, 395, 7, 5, 180, 180);
        
        
    }
}
