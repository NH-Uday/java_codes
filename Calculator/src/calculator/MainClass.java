/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

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
        BasicCalcinterface b1 = new Calculator();
        
        System.out.println("Sum : "+b1.sum(10.5f,11.5f));
        System.out.println("Substraction : "+b1.sub(10.5f,11.5f));
        System.out.println("Multiplication : "+b1.multiplication(10.5f,11.5f));
        System.out.println("Division"+b1.division(10.5f,11.5f));
                
        SciCalcinterface s1 = new Calculator(); 
        
        System.out.println("Root : "+s1.sqrt(10.5f));
        System.out.println("x^y : "+s1.xtoy(10.5f,11.5f));
        
    }
    
}
