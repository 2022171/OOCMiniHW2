/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bus b1 = new Bus(120, "School bus", 30);  //creating the object / calling the constructor from the subclass created call bus
        b1.getSpeed();
        System.out.println(b1.getSpeed()); // outputting the speep
        System.out.println(b1.getNumPassengers()); // outputting the number of passengers
    
    
         Yatch ya1 = new Yatch(65,"Boat", 2, 6);  //creating the object / calling the constructor from the subclass created 
         ya1.getNumSails();
         ya1.getNumPassengers();
        System.out.println("There are " + ya1.getNumPassengers() + " in this boat");  //creating the object / outputting the number of passengers in the airplane
       
        
        
        Airplane air1 = new Airplane(1000, "boeing324", 250); // creating the object / calling the constructor from the subclass created 
        air1.getAltitude();
        System.out.println(air1.getAltitude() );// outputting the altitude
        System.out.println(air1.getColour()); // outputting the colour
        System.out.println(air1.getSize() + " meters long "); // outputting the size of the airplane
        
    
    
}}

