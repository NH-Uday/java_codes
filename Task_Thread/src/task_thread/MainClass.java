/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_thread;

/**
 *
 * @author User
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CounterAFrame frameA = new CounterAFrame();
        frameA.setDefaultCloseOperation(frameA.DISPOSE_ON_CLOSE);
                
         CounterBFrame frameB = new CounterBFrame();
          frameB.setDefaultCloseOperation(frameB.DISPOSE_ON_CLOSE);
          
          frameA.setVisible(true);
          frameB.setVisible(true);
    }
    
}
