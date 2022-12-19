/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritter;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Writter extends Thread {
    String name;
    public static Controller c = new Controller();
    public Writter(String name) {
        this.name=name;
          this.setName(name);
    }
    

    @Override
    public void run() {
      
            MainFrame.c.statrtWrite();
            MainFrame.c.write("Money: ");
            MainFrame.jTextArea1.append("Balance Updated by " +this.name + "           Balance now is:   " + c.getBalance() +"\n");
            MainFrame.c.stopWriting();
    }
     @Override
     
    public String toString() {
        return  "Balance Updates by Thread : " + name+ " Balance now is " + MainFrame.c.getBalance();
    }
    
    
}
