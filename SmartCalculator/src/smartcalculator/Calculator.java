/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcalculator;

/**
 *
 * @author User
 */
public class Calculator {
    
    //properties
    double x = 0.0;
    double y = 0.0;
    double result = 0.0;
    //Constructor
    Calculator(){ }
    
    Calculator(double a,double b){
        
        this.x = a;
        this.y = b;
    }
    //Methods
    
    public double sum(double x,double y){
        return x+y;
    }
    public double sub(double x,double y){
        return x-y;
    }
    public double mul(double x,double y){
        return x*y;
    }
    public void division(double x,double y){
    try {
            
            if( y == 0){
                result = (int) x / (int) y;
            }else{
               
                result = x/y;
            }
            System.out.println("Result = "+result);
    }catch(ArithmeticException a){
    System.out.println("Arithmetic Exception Caight : " + "division by zero ");
    }
    }
    
    
}
