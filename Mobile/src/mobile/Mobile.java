/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

/**
 *
 * @author User
 */
public class Mobile {
    
    //properties
    private String mobileOwnerName; 
    private String mobileNumber;
    private double mobileBalance;
    private String mobileOSName; 
    private boolean lock = false;
    //constructor
    Mobile(){
        
        
    }
    Mobile(String name,String num,double balance,String os){
        
        this.mobileOwnerName = name;
        this.mobileNumber = num;
        this.mobileBalance = balance;
        this.mobileOSName = os;
    }
    //methods
    public void showInfo() {
        
        System.out.println("Name : "+this.mobileOwnerName);
        System.out.println("Number : "+this.mobileNumber);
        System.out.println("Balance : "+this.mobileBalance);
        System.out.println("Operating System : "+this.mobileOSName);
    }
    public void recharge(int amount) {
        
        this.mobileBalance += amount;
        System.out.println("Reachraged : " +amount +"\nNew Balance : "+this.mobileBalance);
    }
    public void callSomeone(int timeDuration) {
        
        if( lock != true) {
        System.out.println("Calling...");
        this.mobileBalance = this.mobileBalance - timeDuration;
        System.out.println("Call time :"+timeDuration);
        System.out.println("New balance:"+this.mobileBalance);
        this.lock = true;
        }
        else{
           System.out.println("The Phone is Locked"); 
        }
        }
}
