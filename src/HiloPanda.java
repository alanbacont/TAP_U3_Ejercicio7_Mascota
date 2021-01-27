
import static java.lang.Thread.sleep;
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
public class HiloPanda extends Thread {
    private boolean ejecutar=true;
    private boolean finalizar=false;
    public Panda p;
    public int contador=0;
    
    public HiloPanda(Panda pan){
    p=pan;
    }
    
    @Override
    public void run() {
        while(ejecutar){
        try{
        contador++;
            if (contador>0&&contador<=2) {
                p.mano++;
                p.mano2++;
                p.mano3++;
                p.mano4++;
                p.mano5++;
                p.saludar=true;
            }
            if (contador>2&&contador<=4) {
                p.mano--;
                p.mano2--;
                p.mano3--;
                p.mano4--;
                p.mano5--;
            }
            if (contador>4&&contador<=6) {
                p.mano++;
                p.mano2++;
                p.mano3++;
                p.mano4++;
                p.mano5++;
            }
            if (contador>6&&contador<=8) {
                p.mano--;
                p.mano2--;
                p.mano3--;
                p.mano4--;
                p.mano5--;
            }
            if (contador>8&&contador<=10) {
                p.saludar=false;
            }
            if (contador>10&&contador<=12) {
                p.ojos=0;
            }
            if (contador>12&&contador<=15) {
                p.ojos=360;
            }
            
            if (contador>20&&contador<=22) {
                p.mano++;
                p.mano2++;
                p.mano3++;
                p.mano4++;
                p.mano5++;
                p.saludar=true;
            }
            if (contador>22&&contador<=24) {
                p.mano--;
                p.mano2--;
                p.mano3--;
                p.mano4--;
                p.mano5--;
            }
            if (contador>24&&contador<=26) {
                p.mano++;
                p.mano2++;
                p.mano3++;
                p.mano4++;
                p.mano5++;
            }
            if (contador>26&&contador<=28) {
                p.mano--;
                p.mano2--;
                p.mano3--;
                p.mano4--;
                p.mano5--;
            }
            if (contador>28&&contador<=30) {
                p.saludar=false;
            }
            if(contador==40){
            contador=0;
            }
            
            
        sleep(100);
        }   catch (InterruptedException ex) {
                Logger.getLogger(HiloPinguino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
