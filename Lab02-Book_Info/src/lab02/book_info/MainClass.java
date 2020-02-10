/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02.book_info;

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
        Book b1 = new Book("Teacher Yourself C++","Herbert Schildt","1001","Programming",10);
        Book b2 = new Book("Harry Potter","J. K. Rowling","1002","Novel",7);
        Book b3 = new Book("Asimov's Science Fiction","Isaac Asimov","1003","Science Fiction",8);
        Book b4 = new Book("The Da Vinci Code","Dan Brown","1004","Thriller",5);
         
        b1.showInfo();
        
        b2.showInfo();
       
        b3.showInfo();
       
        b4.showInfo();
        
        b1.addBookCopy(2);
        
        Book.showTotalBookInfo();
    }
    
}
