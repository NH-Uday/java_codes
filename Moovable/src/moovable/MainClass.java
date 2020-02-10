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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MovablePoint mp = new Move();
        
        MovableCircle mc = new Move();
        
        mp.left();
        mp.right();
        mp.back();
        mp.front();
        
        mc.rleft();
        mc.rright();
        mc.rback();
        mc.rfront();
        
    }
    
}
