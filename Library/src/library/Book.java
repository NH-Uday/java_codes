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
public class Book {
    //properties
    private String bookName;
    private String bookAuthor;  
    private String bookId;
    private String bookType;
    private int bookCopy;
    //constructor
    public Book(){
        
    }
    public Book(String name,String writer,String id,String type,int copy){
        this.bookName=name;
        this.bookAuthor=writer;
        this.bookId=id;
        this.bookType=type; 
        this.bookCopy=copy;
    }
    //methods
    public void showInfo(){
        
        System.out.println("\nName : "+this.bookName);
        System.out.println("Author : "+this.bookAuthor);
        System.out.println("ID : "+this.bookId);
        System.out.println("Type : "+this.bookType);
        System.out.println("Copy : "+this.bookCopy);
    }
    public String getbookName(){
        return this.bookName;
    }
    public int getcopy(){
        return this.bookCopy;
    }
    public void addBookCopy(int x){
        
        this.bookCopy = this.bookCopy+x;
        System.out.println("\nnumber of books added : "+x +"\nfor book "+bookName 
                +"\ntotal number of book : "+bookCopy);
    }
    
}
