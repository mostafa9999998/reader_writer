/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import static pos.ReaderWritersProblem.readCount;
import static pos.ReaderWritersProblem.readLock;
import static pos.ReaderWritersProblem.writeLock;

/**
 *
 * @author Mostafa
 */
public class Read extends ReaderWritersProblem implements Runnable{
     public void run() {
            try {
                readLock.acquire();
                synchronized(ReaderWritersProblem.class) {
                    readCount++;
                }
                if (readCount == 1) {
                    writeLock.acquire();
                }
                readLock.release();

                System.out.println("Thread "+Thread.currentThread().getName() + " is READING");
                Thread.sleep(1500);
                System.out.println("Thread "+Thread.currentThread().getName() + " has FINISHED READING");

                readLock.acquire();
                synchronized(ReaderWritersProblem.class) {
                    readCount--;
                }
                if(readCount == 0) {
                    writeLock.release();
                }
                readLock.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    
}
