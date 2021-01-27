
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
public class TuMascota extends Canvas implements MouseListener{
Image c1=new ImageIcon(getClass().getResource("/jabon.png")).getImage();
Image c2=new ImageIcon(getClass().getResource("/maiz.png")).getImage();
Image c3=new ImageIcon(getClass().getResource("/dormir.png")).getImage();
Image c4=new ImageIcon(getClass().getResource("/pelota.png")).getImage();
Image c5=new ImageIcon(getClass().getResource("/granjero.png")).getImage();
Image c6=new ImageIcon(getClass().getResource("/cerca.png")).getImage();
Image c7=new ImageIcon(getClass().getResource("/arbol.png")).getImage();
Image c8=new ImageIcon(getClass().getResource("/arbol2.png")).getImage();
Image c9=new ImageIcon(getClass().getResource("/sol.png")).getImage();
Image c10=new ImageIcon(getClass().getResource("/luna.png")).getImage();
Borrego b;

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
public int noche=200;
public int movimientos=0;
public int movimientol=0;

Timer tiempo=new Timer(1000,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    noche--;
     if (noche==0) {
            noche=200;
            movimientos=0;
        }
     if (noche==200) {
            movimientol=0;
        }
        repaint();
    }
});

Timer tdia=new Timer(150,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    movimientos++;
        repaint();
    }
});
Timer tnoche=new Timer(50,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    movimientol++;
        
    repaint();
    }
});

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
    repaint();
    }
});
Timer t3=new Timer(1000,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    descansox--;
    repaint();
    
    }
});
Timer t4=new Timer(500,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    divercionx--;
    repaint();
    
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

public TuMascota(){
b=new Borrego();
this.addMouseListener(this);
t1.start();
t2.start();
t3.start();
t4.start();
tdia.start();
tiempo.start();
}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        pintarTuMascotaBorrego(g2);
    }

    
    public void pintarTuMascotaBorrego(Graphics g2){
    
    if(noche>170&&noche<=200){
    tnoche.stop();
    g2.setColor(new Color(153,204,255));
    g2.fillRect(0, 0, 950, 355);
    g2.setColor(new Color(51,255,51));
    g2.fillRect(0, 355, 950, 400);
    g2.drawImage(c9, movimientos, 0, this);
    }
    if(noche>120&&noche<=170){
    g2.setColor(new Color(51,204,255));
    g2.fillRect(0, 0, 950, 355);
    g2.setColor(new Color(51,255,0));
    g2.fillRect(0, 355, 950, 400);
    g2.drawImage(c9, movimientos, 0, this);
    }
    if(noche>80&&noche<=120){
    g2.setColor(new Color(0,204,204));
    g2.fillRect(0, 0, 950, 355);
    g2.setColor(new Color(51,153,0));
    g2.fillRect(0, 355, 950, 400);
    g2.drawImage(c9, movimientos, 0, this);
    }
    if(noche>50&&noche<=80){
    g2.setColor(new Color(0,153,153));
    g2.fillRect(0, 0, 950, 355);
    g2.setColor(new Color(51,102,0));
    g2.fillRect(0, 355, 950, 400);
    g2.drawImage(c9, movimientos, 0, this);
    }
    if(noche>=20&&noche<=50){
        tnoche.start();
    g2.setColor(new Color(0,51,51));
    g2.fillRect(0, 0, 950, 355);
    g2.setColor(new Color(0,51,0));
    g2.fillRect(0, 355, 950, 400);    
    g2.drawImage(c10, movimientol, 0, this);
    }
    if(noche>=0&&noche<=20){
    g2.setColor(new Color(0,102,102));
    g2.fillRect(0, 0, 950, 355);
    g2.setColor(new Color(51,102,0));
    g2.fillRect(0, 355, 950, 400);    
    g2.drawImage(c10, movimientol, 0, this);
    }
    g2.drawImage(c1, 70, 50, this);
    g2.drawImage(c2, 200, 50, this);
    g2.drawImage(c3, 330, 50, this);
    g2.drawImage(c4, 460, 50, this);
    g2.drawImage(c7, 200, 200, this);
    g2.drawImage(c8, 20, 200, this);
    g2.drawImage(c6, 0, 420, this);
    g2.drawImage(c6, 110, 420, this);
    g2.drawImage(c6, 220, 420, this);
    g2.drawImage(c6, 330, 420, this);
    g2.drawImage(c6, 440, 420, this);
    g2.drawImage(c5, 520, 105, this);

    //Barras
    
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
    b.pintarBorregoJuego(g2);
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
