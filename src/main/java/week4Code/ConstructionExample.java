/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4Code;

import javax.swing.JFrame;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ConstructionExample extends JFrame{
    
    boolean activateFlag;
    
    ConstructionExample(){
        
    }
    ConstructionExample(int WIDTH){
        
    }

    ConstructionExample(int WIDTH, int HEIGHT){
        
    }
    
    ConstructionExample(int WIDTH, int HEIGHT, String frameName){
        setName(frameName);
        setSize(WIDTH, HEIGHT);
        setLayout(null);
    }
    
    
    
}
