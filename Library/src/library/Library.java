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
public class Library {
    //properties
    private String libName ;
    private String libAddress ;
    private Book [] listOfBook ;
    private int totalbook;
    
    //constructor
    Library(){
        
    }
    Library(String name,String address){
    
    this.libName = name;
    this.libAddress = address;
    this.listOfBook = new Book[100];  
    }
    
    //methods
    public void print(){
        
        System.out.println("Libraryname : "+this.libName);
        System.out.println("Address : "+this.libAddress);
    }
    void addNewBook(Book book){
       
        for(int i = 0;i<listOfBook.length;i++){
            if(i == listOfBook.length){
              System.out.println("Message: Lirbrary is full! ");    
               break;
               }
            else{
                if(listOfBook[i] == null){
                        listOfBook[i] =  book;
               System.out.println("Message: Book added successfully in "+(i+1)+" of "+this.libName);
                    break;
                    }
            }
        }
    }
    void deleteBook(Book book){
         for(int i = 0; i < listOfBook.length; i++){ 
            if(listOfBook[i]== book){ 
               listOfBook[i] = null;
               System.out.println("\nMessage: Book deleted.");
               break;
               }
       }
        
    }
    void showAllBook(){
    System.out.println("\nList of Book : ");
        for(int i = 0; i < listOfBook.length; i++){
            if(listOfBook[i] != null){
            System.out.print((i+1)+".");
            listOfBook[i].showInfo();
            }
        }
        
    }
 
}
