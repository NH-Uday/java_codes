/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;
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
        HashSet<String> hset = new HashSet<String>();
        TreeSet<String> tset = new TreeSet<String>();
        TreeSet<Integer> tset2 = new TreeSet<Integer>();
        
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        
        hset.add("Apple");
        hset.add("Mango");
        
        hset.add(null);
        hset.add(null);
        
        
        System.out.println(hset);
        
        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");
        
        System.out.println(tset);
        
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        
        System.out.println(tset2);
    }
    
}
