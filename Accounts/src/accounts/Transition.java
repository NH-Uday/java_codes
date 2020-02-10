/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author User
 */
public class Transition {
    //properties
    public Account Sender ;
    public Account Receiver ;
    public int Amount ;
    public String AdditionalInfo ;
    //constructor
    Transition(){
        
    }
    Transition(Account Sender,Account Receiver,int Amount,String info){
  
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.Amount = Amount;
        this.AdditionalInfo = info;
    }   
    //methods
    public void showInfo(){
     System.out.println("\nTransition Information: ");
     System.out.println("A/C Name : "+this.Sender);
     System.out.println("A/C No : "+this.Receiver);
     System.out.println("Balance : "+this.Amount);
     System.out.println("Balance : "+this.AdditionalInfo);
    }
    
}
