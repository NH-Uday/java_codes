/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcalculator;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
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
        double p = 0.0;
        double q = 0.0;
        Calculator c = new Calculator(p,q);
        
        Scanner input = new Scanner (System.in);
        System.out.println("Input Number:");
        try {
            p = input.nextDouble();
            q = input.nextDouble();
                     
        System.out.println("Sum : "+c.sum(p,q));
        System.out.println("Substraction : "+c.sub(p,q));
        System.out.println("multiplication : "+c.mul(p,q));
        c.division(p,q);
    }catch(InputMismatchException i){
            System.out.println("Input Mismatch Caught : " + "Check Input");
        }
    }
}
