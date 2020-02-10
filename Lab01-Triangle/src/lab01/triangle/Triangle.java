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
public class Triangle {
   
    //properties
    private int x;
    private int y;
    private int z;
       
    //constructor
    public Triangle(){
    
}
    public Triangle(int Base,int Height,int Hypotenuse){
        this.x = Base;
        this.y = Height;
        this.z = Hypotenuse;
    }   
   //methods
    public void ShowInfo(){
        
        System.out.println("Triangle Properties: ");
        System.out.println("Base : "+this.x);
        System.out.println("Height : "+this.y);
        System.out.println("Hypotenuse : "+this.z);
    }
    public void test(){
        
       if(x==y && y==z)
            System.out.println("Equilateral");

        else if ((x==y && y!=z ) || (x!=y && z==x) || (z==y && z!=x))
            System.out.println("Isosceles");

        else if(x!=y && y!=z && z!=x)
            System.out.println("Scalene");
    }    
}
