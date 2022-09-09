
package com.mycompany.BookMain;



/**
 *
 * @author salmanawaisa
 */
public class BookMain {

    public static void main(String[] args) throws Exception {
        
        
      
        Storage r1 = new Storage();
        
        r1.addBook(new Book("Salman1", 10,20,30), 5);
        r1.addBook(new Book("Salman2", 10,20,30), 5);
        r1.addBook(new Book("Salman3", 10,20,30), 5);
        
        r1.addBook(new  BestSeller("Salman4", 10,20,30,10,"ahmad"), 5);
        r1.addBook(new  BestSeller("Salman5", 10,20,30,3,"ahh"), 5);
        r1.addBook(new  BestSeller("Salman6", 10,20,30,7,"hhas"), 5);

        
        for (int i=3; i<6;i++) {
            
           r1.Books[i].printInfo();
           
        }
        
         for (int i=3; i<6;i++) {
            System.out.print(
            
             r1.Books[i].getName() +  " " +
           r1.getInStock(r1.Books[i].getName())

            
            );
            
           
             
         }
          r1.rentBook("Salman1");
            
             r1.rentBook("Salman4");
         
        
           for (int i=0; i<7;i++) {
            System.out.print(
            
             r1.Books[i].getName() +  " " +
           r1.getInStock(r1.Books[i].getName())

            
            );
            
            
         }
           
           r1.returnBook("Salman1");
           
           for (int i=0; i<7;i++) {
            System.out.print(
            
             r1.Books[i].getName() +  " " +
           r1.getInStock(r1.Books[i].getName())

            
            );
            
            
         }
           
    }
        
       
        
    }
