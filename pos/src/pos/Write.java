/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

//import static pos.ReaderWritersProblem.writeLock;

/**
 *
 * @author Mostafa
 */
public class Write extends ReaderWritersProblem implements Runnable  {
     public void run() {
            try {
                writeLock.acquire();
                System.out.println("Thread "+ Thread.currentThread().getName() + " is WRITING");
                Thread.sleep(2500);
                System.out.println("Thread "+ Thread.currentThread().getName() + " has finished WRITING");
                writeLock.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
}
