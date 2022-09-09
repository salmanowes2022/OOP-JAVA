/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BookMain;

/**
 *
 * @author salmanawaisa
 */
public class BestSeller extends Book {
    
    int worldCopies;
    
    String summary;
    
    


    public BestSeller(String name, double price, int last_id, int id , int wordCopies , String summary) {
        super(name, price, last_id, id);
        
       this.worldCopies  = wordCopies;
        this.summary = summary;
        
        
        
        
        
        
        
        
        
    }

    public int getWorldCopies() {
        return worldCopies;
    }

    public void setWorldCopies(int worldCopies) {
        this.worldCopies = worldCopies;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    
    
   public void getInfo() {
       
       System.out.print(" the best seller " + getName());
       
       
   }
    
    
}
