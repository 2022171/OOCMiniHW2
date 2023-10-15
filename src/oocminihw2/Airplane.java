/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author danie
 */
public class Airplane extends Vehicle implements Flyable{
    
    private String Colour; // i created the class aiplane and i gave 2 attr
    private double size;

    public Airplane(float speed, String type, int numPassengers) {  //// inherited the constructor from the super class
        super(speed, type, numPassengers);
    }
  
    
  

    public String getColour() {
        return "white";
    }

    public double getSize() {
        return 20;
    }
    
    
   @Override
   public  float getAltitude(){
   return 5000;
    }

    
    
    
    
    
    
    
}
