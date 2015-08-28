/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadex2sem3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author user
 */
public class Even {
    
private AtomicInteger n1 = new AtomicInteger();
private int n = 0;
public int next()
{
    
n++;
n++;
return n;

    
}

}
  

