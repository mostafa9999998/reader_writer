/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Mostafa
 */

    
    
public class Pos {
    
 public static void main(String[] args) throws Exception {
        Read read = new Read();
        Write write = new Write();
        
        Thread t1 = new Thread( read);
        t1.setName("thread1");
        Thread t2 = new Thread( write);
        t2.setName("thread2");
        Thread t3 = new Thread( write);
        t3.setName("thread3");
        Thread t4 = new Thread( read);
        t4.setName("thread4");
        Thread t5 = new Thread( write);
        t5.setName("thread5");
        //Thread t6 = new Thread( write);
        //t6.setName("thread6");

        t1.start();
        t3.start();
        t2.start();
        t4.start();
        t5.start();
        //t6.start();
    }
}

   


