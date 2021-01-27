
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class Precentacion extends Canvas {
    private int areax=350;
    private int areay=300;
    private int alto=70;
    private int ancho=250;
    
    public boolean EstaArea(int x,int y){
    int x2=areax+ancho;
    int y2=areay+alto;
        if (x>=areax &&x<=x2) {
            if (y>=areay&&y<=y2) {
                return true;
            }
        }
    return false;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2=(Graphics2D)g;
        this.setBackground(Color.WHITE);
        g2.setFont(new Font("Ravie",Font.PLAIN,45));
        g2.setColor(Color.red);
        g2.drawString("Tu", 300, 200);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Mascota", 350, 250);
        g2.setColor(new Color(51,28,0));
        g2.fillOval(100, 300, 60, 60);
        g2.fillOval(120, 23, 80, 80);
        g2.fillOval(270,60, 50, 50);
        g2.fillOval(220, 510, 90, 90);
        g2.fillOval(400, 530, 50, 50);
        g2.fillOval(500, 100, 70, 70);
        g2.fillOval(520, 400, 50, 50);
        g2.fillOval(90, 460, 20, 20);
        g2.fillOval(630, 300, 30, 30);
        g2.fillOval(520, 600, 40, 40);
        g2.fillOval(600, 570, 100, 100);
        g2.fillOval(0, 550, 120, 120);
        g2.fillOval(-30, 100, 120, 120);
        g2.fillOval(640, 0, 120, 120);
        g2.fillOval(760, 200, 80, 80);
        g2.fillOval(900, 0, 120, 120);
        g2.fillOval(800, 350, 90, 90);
        g2.fillOval(830, 500, 60, 60);
        g2.fillOval(900, 570, 100, 100);

        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRoundRect(350, 300, 250, 70, 20, 20);
        g2.setColor(Color.DARK_GRAY);
        g2.setFont(new Font("Arial",Font.PLAIN,25));
        g2.drawString("Iniciar", 440, 340);
    }
    
    
    /*
    public boolean Dibujar(Graphics g2){
        g2.setFont(new Font("Ravie",Font.PLAIN,45));
        g2.setColor(Color.red);
        g2.drawString("Tu", 300, 200);
        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Mascota", 350, 250);
        g2.setColor(new Color(51,28,0));
        g2.fillOval(100, 300, 60, 60);
        g2.fillOval(120, 23, 80, 80);
        g2.fillOval(270,60, 50, 50);
        g2.fillOval(220, 510, 90, 90);
        g2.fillOval(400, 530, 50, 50);
        g2.fillOval(500, 100, 70, 70);
        g2.fillOval(520, 400, 50, 50);
        g2.fillOval(90, 460, 20, 20);
        g2.fillOval(630, 300, 30, 30);
        g2.fillOval(520, 600, 40, 40);
        g2.fillOval(600, 570, 100, 100);
        g2.fillOval(0, 550, 120, 120);
        g2.fillOval(-30, 100, 120, 120);
        g2.fillOval(640, 0, 120, 120);
        g2.fillOval(760, 200, 80, 80);
        g2.fillOval(900, 0, 120, 120);
        g2.fillOval(800, 350, 90, 90);
        g2.fillOval(830, 500, 60, 60);
        g2.fillOval(900, 570, 100, 100);

        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRoundRect(350, 300, 250, 70, 20, 20);
        g2.setColor(Color.DARK_GRAY);
        g2.setFont(new Font("Arial",Font.PLAIN,25));
        g2.drawString("Iniciar", 440, 340);
    return true;
    }*/

   
}
