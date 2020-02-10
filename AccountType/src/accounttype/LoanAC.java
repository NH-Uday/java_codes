/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttype;

/**
 *
 * @author User
 */
public class LoanAC extends Account{
    //constructor
    LoanAC(){
        this.acType = "LoanAC";
    }
    LoanAC(Account account,Customer customer){
        this.acType = "LoanAC";
    }
    
}
