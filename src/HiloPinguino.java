
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
public class HiloPinguino extends Thread {
    private boolean ejecutar=true;
    private boolean finalizar=false;
    public int contador=0;
    public int contador2=0;
    public Pinguino p;
    
    public HiloPinguino(Pinguino pin){
    p=pin;
    }
    @Override
    public void run() {
        while(ejecutar){
        try{
        contador++;
        contador2++;
        p.caminar++;
            if (contador2>=50&&contador2<=250) {
                p.aumentar++;
                
            }
            if (contador>0&&contador<=2) {
                p.manos++;
            }
            if (contador>2&&contador<=4) {
                p.manos--;
            }
            if (contador>4&&contador<=6) {
                p.manos++;
            }
            if (contador>6&&contador<=8) {
                p.manos--;
            }
            if(contador>4&&contador<=6){
            p.ojos=0;
            }
            if (contador>6&&contador<=8) {
                p.ojos=360;
            }
            if(contador>8&&contador<=9){
            p.ojos=0;
            }
            if (contador>9&&contador<=10) {
                p.ojos=360;
            }
            if (contador>20&&contador<=22) {
            p.pata1++;
            }
            if (contador>22&&contador<=24) {
            p.pata1--;
            }
            if (contador>22&&contador<=24) {
            p.pata2++;
            }
            if (contador>24&&contador<=26) {
            p.pata2--;
            }
            if (contador>26&&contador<=28) {
            p.pata1--;
            }
            if (contador>28&&contador<=30) {
            p.pata1++;
            }
            if (contador>28&&contador<=30) {
            p.pata2--;
            }
            if (contador>30&&contador<=32) {
            p.pata2++;
            }
            
            if (contador2>=250&&contador2<=450) {
                p.aumentar--;
                
            }
            if (contador==32) {
                contador=0;
                
            }
            if (contador2==450) {
                contador2=0;
                p.caminar=0;
            }
            
            
        sleep(50);
        }   catch (InterruptedException ex) {
                Logger.getLogger(HiloPinguino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
