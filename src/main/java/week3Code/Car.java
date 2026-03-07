/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Car {
    String color;
    public String speed;
    public int slow;
        
    public Car(String color, int speed){
        this.color=color;
//        this.speed=speed;
        
    }
    
    public void drive(boolean fourWheel){
        String tires = "wide";
        fourWheel = true;
        tires = "flat";
        
    }
    
    
    public void paint(String oldColor, String newColor){
        
    }
    
//    public void setSpeed(int speed){
//        this.speed = speed;
//    }
    
    public String getSpeed(){
        return speed;
    }
    
    public void setSlow(int slow){
        this.slow = slow;
        
    }
    
    public int getSlow(){
        return slow;
    }
    
    public void setCarModel(){
        
    }
    
    
    
}
