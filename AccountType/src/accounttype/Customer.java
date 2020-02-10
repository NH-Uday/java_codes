/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttype;

/**
 *
 * @author User
 */
public class Customer {
    
    //Properties
    private String name;
    private String address;
    protected String accNo;
    protected double balance;
//constructor
Customer(){

}
Customer(String n,String a,String accNo, double bl) {
         this.name= n;
         this.address = a;
         this.accNo = accNo;
         this.balance = bl;
     }      
  //methods
public void printCustomerInfo(){
    
     System.out.println("\nCustomer Information: ");
     System.out.println("\nA/C No:"  + this.accNo);
     System.out.println("A/C balance:"  + this.balance);
     System.out.println("A/C Name : "+this.name);
     System.out.println("A/C Address : "+this.address);
}
    
}
