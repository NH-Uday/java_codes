/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

/**
 *
 * @author User
 */

public class Contact {
    //Properties
    private String personName; 
    private String personId; 
    private int Age;
    private String mobileNumber; 
    private char gender;
    
    
    //Constructor
    Contact(){
        
  
    }
    Contact(String name,String id,int age,String num,char gen){
        this.personName = name;
        this.personId = id;
        this.Age = age;
        this.mobileNumber = num;
        this.gender = gen;
    }    
    //Methods
    public void showPersonInfo(){
        
        System.out.println("\nName : "+this.personName);
        System.out.println("ID : "+this.personId);
        System.out.println("Age : "+this.Age);
        System.out.println("Phone number : "+this.mobileNumber);
        System.out.println("Gender : "+this.gender);
    }  
    public void detectMobileOperator(){
       
       if(this.mobileNumber.substring(0,3).equals("017"))
           System.out.print("GrameenPhone");
       
       else if(this.mobileNumber.substring(0,3).equals("019"))
           System.out.println("Banglalink");
       
       else if(this.mobileNumber.substring(0,3).equals("016"))
           System.out.println("Airtel");
       
       else if(this.mobileNumber.substring(0,3).equals("018"))
           System.out.println("Robi");
       
       else
           System.out.println("Invalid number");
       
       /*switch(this.mobileNumber.substring(0,3)){
           
           case "019" :
               System.out.println("Banglalink");
               break;
           case "017" :
               System.out.println("GrameenPhone");
               break;
           case "016" :
               System.out.println("Airtel");
               break;
           case "018" :
               System.out.println("Robi");
               break;
           default :
               System.out.println("Invalid Number");
       }*/
    }
}