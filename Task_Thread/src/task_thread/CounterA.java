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
public class CounterA implements Runnable{
    
    boolean running = true;
    String Output = "";
    public void run(){
      increment();  
    };
     public void increment(){
         for(int c= 0; c<= 100;c++){
             if(running = true){
                 Output = "CounterA : increment()"+c+"\n"+Output;
             System.out.println("CounterA: increment()"+c);
         try{
             Thread.sleep(100);
             
         }catch(InterruptedException e){
             System.out.println("Increment Exception : "+e);
         }
         }else{
                 break;
             }
     }
}
public void stopIncrement(){
    this.running = false;
}
public String getOutput(){
   return Output; 
}
}
