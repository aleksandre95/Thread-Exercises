/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadex2sem3;

/**
 *
 * @author user
 */
public class ThreadEx2Sem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Even even = new Even();
        Thread1 t1= new Thread1(even);
        Thread2 t2 = new Thread2(even);
        
        t1.start();
        
        t2.start();
        
        
    }
    
}
