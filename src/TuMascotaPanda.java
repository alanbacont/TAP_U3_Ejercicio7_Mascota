
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
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
public class TuMascotaPanda extends Canvas implements MouseListener{
Image c1=new ImageIcon(getClass().getResource("/jabon.png")).getImage();
Image c2=new ImageIcon(getClass().getResource("/bamboo.png")).getImage();
Image c3=new ImageIcon(getClass().getResource("/dormir.png")).getImage();
Image c4=new ImageIcon(getClass().getResource("/pelota.png")).getImage();      
Image c5=new ImageIcon(getClass().getResource("/bambus.png")).getImage();
Image c6=new ImageIcon(getClass().getResource("/casa.png")).getImage();
    

public Panda p;    
public int jabonx=70;
public int jabony=65;
public int comidax=200;
public int comiday=55;
public int dormirx=330;
public int dormiry=65;
public int jugarx=460;
public int jugary=55;

public int limpiezax=200;
public int alimentacionx=200;
public int descansox=200;
public int divercionx=200;


Timer t1=new Timer(1000,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    limpiezax--;
    repaint();
    }
});
Timer t2=new Timer(600,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    alimentacionx--;
    }
});
Timer t3=new Timer(2000,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    descansox--;
    }
});
Timer t4=new Timer(500,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    divercionx--;
    }
});

public boolean EstaAreaJabon(int x,int y){
    int x2=jabonx+65;
    int y2=jabony+50;
        if (x>=jabonx &&x<=x2) {
            if (y>=jabony&&y<=y2) {
                return true;
            }
        }
    return false;
    
    }
public boolean EstaAreaComida(int x,int y){
    int x2=comidax+70;
    int y2=comiday+65;
        if (x>=comidax &&x<=x2) {
            if (y>=comiday&&y<=y2) {
                return true;
            }
        }
    return false;
    }
public boolean EstaAreaDormir(int x,int y){
    int x2=dormirx+65;
    int y2=dormiry+50;
        if (x>=dormirx &&x<=x2) {
            if (y>=dormiry&&y<=y2) {
                return true;
            }
        }
    return false;
    }
public boolean EstaAreaJugar(int x,int y){
    int x2=jugarx+65;
    int y2=jugary+50;
        if (x>=jugarx &&x<=x2) {
            if (y>=jugary&&y<=y2) {
                return true;
            }
        }
    return false;
    }

public TuMascotaPanda(){
this.addMouseListener(this);
p=new Panda();
t1.start();
t2.start();
t3.start();
t4.start();
}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        pintarTuMascotaPanda(g2);
    }
    
    public void pintarTuMascotaPanda(Graphics g2){
    
    g2.setColor(new Color(102,204,255));
    g2.fillRect(0, 0, 950, 400);    
    g2.setColor(new Color(0,153,0));
    g2.fillRect(0, 400, 950, 300);
    
    g2.drawImage(c1, 70, 50, this);
    g2.drawImage(c2, 200, 50, this);
    g2.drawImage(c3, 330, 50, this);
    g2.drawImage(c4, 460, 50, this);
    g2.drawImage(c5, 0, 200, this);
    g2.drawImage(c5, 800, 200, this);
    g2.drawImage(c5, -50, 220, this);
    g2.drawImage(c5, -80, 250, this);
    g2.drawImage(c5, 50, 180, this);
    g2.drawImage(c5, 750, 180, this);
    g2.drawImage(c5, 830, 250, this);
    g2.drawImage(c5, 900, 300, this);
    g2.drawImage(c6, 200,130, this);
    
    g2.setFont(new Font("Cooper Black",Font.PLAIN,15));
    g2.setColor(Color.BLACK);
    g2.drawString("Limpieza", 750, 20);
    g2.drawRoundRect(700, 30, 200, 13, 15, 20);
    g2.setColor(Color.red);
    g2.fillRoundRect(700, 30,limpiezax, 13, 15, 20);
    g2.setColor(Color.BLACK);
    g2.drawString("Alimentacion", 750, 60);
    g2.drawRoundRect(700, 70, 200, 13, 15, 20);
    g2.setColor(Color.red);
    g2.fillRoundRect(700, 70, alimentacionx, 13, 15, 20);
    g2.setColor(Color.BLACK);
    g2.drawString("Descanso", 750, 100);
    g2.drawRoundRect(700, 110, 200, 13, 15, 20);
    g2.setColor(Color.red);
    g2.fillRoundRect(700, 110, descansox, 13, 15, 20);
    g2.setColor(Color.BLACK);
    g2.drawString("Divercion", 750, 140);
    g2.drawRoundRect(700, 150, 200, 13, 15, 20);
    g2.setColor(Color.red);
    g2.fillRoundRect(700, 150, divercionx, 13, 15, 20);
    p.dibujarPandaJuego(g2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (EstaAreaJabon(e.getX(), e.getY())) {
            if(limpiezax<=192){
                limpiezax=limpiezax+10;
                
            }
        }
        if (EstaAreaComida(e.getX(), e.getY())) {
            if(alimentacionx<=192){
                alimentacionx=alimentacionx+10;
                
            }
        }
        if (EstaAreaDormir(e.getX(), e.getY())) {
            if(descansox<=192){
                descansox=descansox+10;
                
            }
        }
        if (EstaAreaJugar(e.getX(), e.getY())) {
            if(divercionx<=192){
                divercionx=divercionx+10;
                
            }
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
