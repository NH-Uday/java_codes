/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcalculator;

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
        double x = 0.0,y = 0.0,result2;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Input :");
        try {
            x= input.nextDouble();
            y = input.nextDouble();
            
            if( y == 0){
                result2 = (int) x / (int) y;
            }else{
               
                result2 = x/y;
            }
            System.out.println("Result = "+result2);
                     
        }catch(InputMismatchException iex){
            System.out.println("Input Mismatch Caught : " + "Check Input");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Caight : " + "division by zero ");
        }
    }
    
}
