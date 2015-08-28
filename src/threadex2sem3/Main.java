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
public class Main extends Thread {
    public static void main(String[] args) {
        Thread3 t = new Thread3();
         t.start();
    }
    
}
