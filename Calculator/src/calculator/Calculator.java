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
public class Calculator implements BasicCalcinterface,SciCalcinterface{
    
    //Constructor
    Calculator(){ }
    

    //Methods
    
    public float sum(float x,float y){
        return x+y;
    }
    public float sub(float x,float y){
        return x-y;
    }
    public float multiplication(float x,float y){
        return x*y;
    }
    public float division(float x,float y){
        return x/y;
    }
    public float sqrt(float x){
        return (float)Math.sqrt(x);
    }
    public float xtoy(float x,float y){
        
        return (float)Math.pow(y, y);
    }
}
