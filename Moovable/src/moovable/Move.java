/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moovable;

/**
 *
 * @author User
 */
public class Move implements MovableCircle,MovablePoint{
    
    Move(){
        
    }

    public void left(){
        System.out.println("move left\n");
    } 
    public void right(){
        System.out.println("move right\n");
    } 
    public void back(){
        System.out.println("move back\n");
    } 
    public void front(){
        System.out.println("move front\n");
    } 
    public void rleft(){
        System.out.println("roll left\n");
    } 
    public void rright(){
        System.out.println("roll right\n");
    } 
    public void rback(){
        System.out.println("roll back\n");
    } 
    public void rfront(){
        System.out.println("roll front\n");
    } 
}
