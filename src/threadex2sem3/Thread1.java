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
public class Thread1 extends Thread {
    Even even;

    public Thread1(Even even) {
        this.even = even;
    }
    public void run(){
    
        System.out.println(even.next());
    }
    
}
