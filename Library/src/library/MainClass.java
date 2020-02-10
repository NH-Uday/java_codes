/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

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
        Library l1 = new Library("AIUB Library","kuril");
        Library l2 = new Library("Central Library","T.S.C.");
        
        Book b = new Book("Teach Yourself C++","Herbert Schildt","1001","Programming",10);
        Book b1 = new Book("Harry Potter","J. K. Rowling","1002","Novel",7);
        
        l1.addNewBook(b);
        l1.addNewBook(b1);
        l1.print();
        l1.showAllBook();
        l1.deleteBook(b1);
        l1.showAllBook();
        b.addBookCopy(2);

    }
    
}
