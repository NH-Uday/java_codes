/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

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
        Mobile m1 = new Mobile("udoy","01716359887",100,"android");
        
        m1.showInfo();
        m1.recharge(20);
        m1.callSomeone(15);
        
    }
    
}
