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
public class EvenUser implements Runnable {
    Even even;

    public EvenUser(Even even) {
        this.even = even;
    }
    @Override
    public void run() {
        even.next();
    }
    
    
}
