/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author User
 */
public class Grandfather {
    
    //properties
     protected String whoami="";       
     protected String name = "";
    //constructor
    Grandfather(){
       this.whoami = "Grandfather"; 
    }
    Grandfather(String n){
        
      this.whoami="Grandfather"  ;
      this.name = n;  
    }
    public void show(){
        System.out.println("I am a : "+this.whoami);
        System.out.println("My name is : "+this.name);
    }    
        
    //methods
}
