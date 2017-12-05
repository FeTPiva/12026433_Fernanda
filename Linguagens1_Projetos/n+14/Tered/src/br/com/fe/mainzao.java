
package br.com.fe;

/**
 *
 * @author fefe
 */

public class mainzao{
//pegar o chat e usar o thread pra ser um chat continuo
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Programa1 p1 = new Programa1();
        Thread t1 = new Thread(p1);
        t1.start();
        
        Programa2 p2 = new Programa2();
        Thread t2 = new Thread((Runnable) p2);
        t2.start();
        
       
    }
    
}
