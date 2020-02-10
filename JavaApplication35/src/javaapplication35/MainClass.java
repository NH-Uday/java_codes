/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;
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
        ArrayList alist = new ArrayList();
        LinkedList<String> linkedlist = new LinkedList<String>();
        
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");
        alist.add(1);
        alist.add(1.0);
        
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");
        
        System.out.println(alist);
        //display element with for each
        for(Object item:alist){
           System.out.println(item); 
        }
        alist.add(3,"Steve");
        
        System.out.println(alist);
        
        //remove an object
        alist.remove(2);
        
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        
        System.out.println("Linkedlist items : "+linkedlist); 
        
        Object firstvar = linkedlist.get(0);
        System.out.println("First element : "+firstvar);
        
        linkedlist.set(0,"Changed First Item");
        
        Object firstvar2 = linkedlist.get(0);
        System.out.println("Updated First element : "+firstvar2);
        
        linkedlist.removeFirst();
        linkedlist.removeLast();
        
        System.out.println("Linkedlist items : "+linkedlist); 
        
        linkedlist.add(0,"New item");
        linkedlist.remove(2);
        System.out.println("Linkedlist items : "+linkedlist);
    }
    
}
