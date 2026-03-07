/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3Code;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MainCar {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car hyundai = new Car("red", 120);
        int strSpeed = (Integer.parseInt(hyundai.speed));
        String intSlow = (String.valueOf(hyundai.slow));
        hyundai.setSlow(90);

//        String carColor = c.color;
//        int carSpeed = c.speed;
        //boolean carFourWheel = c.fourWheel;
//        String carTires = c.tires;

        
    }
    
}
