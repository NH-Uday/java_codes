/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIDemo01;

/**
 *
 * @author User
 */
class student {
    public String Student_ID;
    public String Student_Name;
    public String Department;
    public String Major;
    
    //student(){};
    
    public student(String id,String name,String dept,String major){
        
       this.Student_ID=id;
       this.Student_Name=name;
       this.Department=dept;
       this.Major=major;
    }
    public String getid(){
        return Student_ID;
    }
    public String getname(){
        return Student_Name;
    }
    public String getdept(){
        return Department;
    }
    public String getmajor(){
        return Major;
    }
}
