/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.*;

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
        LinkedList linkedlist = new LinkedList();
        
        linkedlist.add("Item1");
        linkedlist.add("Item2");
        linkedlist.add("Item3");
        linkedlist.add("Item4");
        linkedlist.add("Item5");
        linkedlist.add(1);
        linkedlist.add(1.0);
        
        System.out.println("Linkedlist items : "+linkedlist);
        
        for(Object item:linkedlist){
           System.out.println(item); 
        }
    }
    
}
