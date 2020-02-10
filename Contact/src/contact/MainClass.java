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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contact c1= new Contact("utsho","9991",16,"01711111111",'M');
        Contact c2= new Contact("utsha","992",12,"01911111111",'F');
        Contact c3= new Contact("Iraz","9993",20,"01611111111",'M');
        Contact c4= new Contact("Sunan","9994",20,"01811111111",'M');
        Contact c5= new Contact("Ifti","9995",20,"01911111111",'M');
        
        c1.showPersonInfo();
        
        c1.detectMobileOperator();
        c2.showPersonInfo();
        
        c2.detectMobileOperator();
        
        c3.showPersonInfo();
        
        c3.detectMobileOperator();
         
        c4.showPersonInfo();
        
        c4.detectMobileOperator();
        
        c5.showPersonInfo();
        
        c5.detectMobileOperator();
    }
    
}
