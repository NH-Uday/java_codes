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
public class CounterA extends Thread{
    
    public void run(){
      increment();  
    };
     public void increment(){
         for(int c= 0; c<= 100;c++){
             System.out.println("CounterA: increment()"+c);
         try{
             Thread.sleep(200);
             
         }catch(InterruptedException e){
             System.out.println("Increment Exception : "+e);
         }
         }
     }
}
