
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class HiloBorrego extends Thread implements MouseListener {
    private boolean ejecutar=true;
    private boolean finalizar=true;
    public Borrego b;
    private int contador=0;
    public int x=200;
    public int y=0;
    
    public HiloBorrego(Borrego borre){
    b=borre;
    }
    
    @Override
    public void run() {
        while(ejecutar){
            try{
            contador++;
            b.contador++;
            if(contador>=0&&contador<=5){
            b.cola++;
            }
            if (contador>5&&contador<=10) {
            b.cola--;    
            }
            if (contador>10&&contador<=15) {
            b.cola++;    
            }
            if (contador>15&&contador<=20) {
            b.cola--;    
            }
            if(contador<=40){
            b.cabeza++;
            }      
            if(contador>=40){
            b.cabeza--;
            }
            if (contador>=80&&contador<120) {
            b.cabeza=400;    
            }
            if(contador>80&&contador<=85){
            b.cola++;
            }
            if (contador>85&&contador<=90) {
            b.cola--;    
            }
            if (contador>95&&contador<=100) {
            b.cola++;    
            }
            if (contador>100&&contador<=105) {
            b.cola--;    
            }
            if (contador==120) {
            contador=0;
            b.contador=0;
            }
            if (contador>80&&contador<83) {
                b.parpadeo=360;
            }
            if(contador>83&&contador<90){
            b.parpadeo=180;
            }
            if (contador>90&&contador<93) {
                b.parpadeo=360;
            }
            if(contador>93&&contador<120){
            b.parpadeo=180;
            }
            if(contador>100&&contador<=102){
            b.masticando++;
            }
            if(contador>102&&contador<=104){
            b.masticando--;
            }
            if(contador>104&&contador<=106){
            b.masticando++;
            }
            if(contador>106&&contador<=108){
            b.masticando--;
            }
    
                
            sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloBorrego.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
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
