/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BookMain;

/**
 *
 * @author salmanawaisa
 */
public class Book {
    
    private  int id;
    
    private  String  name;
    
    private  int last_id;
    
    private  double  price;
    
    
    
    
    

    
    public Book(String name , double price ,int last_id,int id) {
        
        this.name = name;
        this.price = price;
        this.id = id;
        this.last_id = id;
        
        
    
        
        
        
        
    }
    
    public void printInfo() {
        System.out.println("the book name  " + this.name);
        
    }
    

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  int getLast_id() {
        return last_id;
    }

    public  void setLast_id(int last_id) {
        this.last_id = last_id;
    }
    
    
    

}

