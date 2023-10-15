/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Drivable {  // hi teacher, somehow when i was implemnting the airplane class i was getting error because of the float, so i commented it out
    //public void accelerate(float speed);
    //public void brake();
   // public void turn(float angle);
    public float getDirection(); 
    public float getSpeed();   
    public String getMake();    
    public String getType();
}
