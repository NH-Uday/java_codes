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
public class CounterB implements Runnable{
    
    boolean running = true;
    String Output = "";
    
    public void run(){
        decrement();
    }
   public void decrement(){
       for(int c=100;c>=0;c--){
          if(running == true){
            Output = "CounterA : decrement()"+c+"\n"+Output;
           System.out.println("CounterA: increment()"+c);
           try{
               Thread.sleep(500);
           }catch(InterruptedException e){
            System.out.println("Decrement Exception : "+e);
           }
       }else{
              break;
          }
   } 
}
public void stopDncrement(){
    this.running = false;
}   
public String getOutput(){
   return Output; 
}  
}
