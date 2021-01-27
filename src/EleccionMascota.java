
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static javax.swing.JOptionPane.showMessageDialog;
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
public class EleccionMascota extends Canvas implements MouseListener{
    public Borrego b;
    public Pinguino p;
    public Panda pa;
    boolean puntero=false;
    boolean puntero2=false;
    boolean puntero3=false;
    
    private int areax=80;
    private int areay=380;
    private int alto=120;
    private int ancho=220;
    
    private int areax1=350;
    private int areay1=380;
    private int alto1=120;
    private int ancho1=220;
    
    private int areax2=600;
    private int areay2=380;
    private int alto2=120;
    private int ancho2=220;
    
    Timer t=new Timer(100,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            repaint();
        }
    });
    
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
    public boolean EstaArea2(int x,int y){
    int x2=areax1+ancho1;
    int y2=areay1+alto1;
        if (x>=areax1 &&x<=x2) {
            if (y>=areay1&&y<=y2) {
                return true;
            }
        }
    return false;
    }
    public boolean EstaArea3(int x,int y){
    int x2=areax2+ancho2;
    int y2=areay2+alto2;
        if (x>=areax2 &&x<=x2) {
            if (y>=areay2&&y<=y2) {
                return true;
            }
        }
    return false;
    }
    public EleccionMascota(){
    this.addMouseListener(this);
    b=new Borrego();
    p=new Pinguino();
    pa=new Panda();
    t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        this.setBackground(Color.darkGray);
        g2.setFont(new Font("Century Gothic",Font.PLAIN,50));
        g2.setColor(Color.GRAY);
        g2.drawString("Elige Mascota", 310, 100);
        //Dibujar Mascota 
        b.pintarBorrego(g2);
        p.PintarPinguino(g2);
        pa.dibujarPanda(g2);
        
    }
 

    @Override
    public void mouseClicked(MouseEvent e) {
        if (EstaArea(e.getX(),e.getY())) {
            pantalla3 p3=new pantalla3();
            p3.setVisible(true);
        }
        if (EstaArea2(e.getX(),e.getY())) {
            pantalla4 p4=new pantalla4();
            p4.setVisible(true);
        }
        if (EstaArea3(e.getX(),e.getY())) {
           pantalla5 p5=new pantalla5();
           p5.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
        
    
}
