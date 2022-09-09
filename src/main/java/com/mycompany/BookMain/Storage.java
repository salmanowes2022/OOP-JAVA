/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BookMain;

/**
 *
 * @author salmanawaisa
 */
public class Storage {
    
    
  Book[] Books;
    
  int[]inStocks;
  
  
  
public Storage() {
    
    
  Books = new Book [10];
  inStocks = new int [10];
  
  
}

   
    
    
    
    
    public void addBook( Book newbook,int amount) {
        
        
        //adds a books to the books array and adds the amount to inStock. 
      
        
       for(int i =0 ;i<Books.length ; i++) {
           
           if(Books[i]==null) {
               
              Books[i] = newbook;
              inStocks[i] = amount;
              break ;
              
           }
           
       }
       
         
         
        
    }    
     public void rentBook( String BookName) {
       
        // String  -  reduces inStock array (miust return error message if book with 0 elements is used )
        
         for(int i =0 ;i<Books.length ; i++) {
           
           if(Books[i].getName()==BookName) {
               if (inStocks[i]!=0) {
                   
                      inStocks[i] = inStocks[i]-1;
               }else {
                   System.out.print("the amount is empty");
                   
               }
           }
         }
        

    }  
     
      public void returnBook( String BookName) {
        
        // updates book in stock value
         for(int i =0 ;i<Books.length ; i++) {
           
           if(Books[i].getName()==BookName) {
               if (inStocks[i]!=0) {
                   
                      inStocks[i] = inStocks[i]+1;
             
                   
               }
           }
         }
        
        
        
        
        
    }  
       public int getInStock( String BookName) {
        
        
        //  getInStock(String BookName) : int – returns the current amount of the given book in stock
            for(int i =0 ;i<Books.length ; i++) {
           
           if(Books[i].getName()==BookName) {
               
                   
                    return inStocks[i];
             
                   
               
           }
           
             
         } 
            System.out.print("the book was not found ");
         
      return -1;
        
        
    
    
       } 
}
