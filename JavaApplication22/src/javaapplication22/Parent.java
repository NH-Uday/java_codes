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
public class Parent extends Grandfather{
    //properties
    
    
    //contructors
    public Parent(){
        
        this.whoami = "parent";
    }
    public Parent(String n){
                
        this.whoami = "parent";
        this.name = n;
    }
            //methods
    public void print(){
                
        System.out.println("I am a : "+this.whoami);
        System.out.println("My name is : "+this.name);
    }
    
}
