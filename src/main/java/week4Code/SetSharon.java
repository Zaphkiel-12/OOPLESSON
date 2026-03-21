/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4Code;

import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SetSharon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String choice = (String) JOptionPane.showInputDialog(null, "Select Screen Size", 
                "Screen Selection", JOptionPane.QUESTION_MESSAGE, null, BalutApp.screenSizes.toArray(),
                BalutApp.screenSizes.get(2));
        
        if(choice == null) choice = "Normal Screen";
               
        BalutApp app = new BalutApp(choice);
        app.setVisible(true);
                
    }
    
}
