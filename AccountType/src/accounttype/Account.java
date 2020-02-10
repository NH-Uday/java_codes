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
public class Account {
    
    //propertie
    protected String acType ;
    private Customer[] listOfcustomer;
    
    //Construvtor
   public Account(){
  
    }
    public Account (String n){
        this.acType = n;
        this.listOfcustomer = new Customer[100];
    }
    //Methods
    public void printAccInfo(){
        System.out.println("A/C Type:"  + this.acType);
    }
    void addNewcustomer(Customer customer){
       
        for(int i = 0;i<listOfcustomer.length;i++){
            if(i == listOfcustomer.length){
              System.out.println("Message: Customer list full ");    
               break;
               }
            else{
                if(listOfcustomer[i] == null){
                        listOfcustomer[i] =  customer;
               System.out.println("Message: Customer added successfully");
                    break;
                    }
            }
        }
    }
    void showAllcustomer(){
    System.out.println("\nList of Customer : ");
        for(int i = 0; i < listOfcustomer.length; i++){
            if(listOfcustomer[i] != null){
            System.out.print((i+1)+".");
            listOfcustomer[i].printCustomerInfo();
            }
        }
        
    }
    
    
    
    
    
}
