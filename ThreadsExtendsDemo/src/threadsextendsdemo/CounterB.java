/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsextendsdemo;

/**
 *
 * @author User
 */
public class CounterB extends Thread{
    
    public void run(){
        decrement();
    }
   public void decrement(){
       for(int c=100;c>=0;c--){
           
           System.out.println("CounterA: increment()"+c);
           try{
               Thread.sleep(100);
           }catch(InterruptedException e){
            System.out.println("Increment Exception : "+e);
           }
       }
   } 
}
