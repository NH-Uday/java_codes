/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.triangle;

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
        Triangle o1 =new Triangle(3,4,5);
        Triangle o2 =new Triangle(3,3,3);
        Triangle o3 =new Triangle(4,4,5); 
        
    o1.ShowInfo();
    o1.test();
    o2.ShowInfo();
    o2.test();
    o3.ShowInfo();
    o3.test();
    }
}
