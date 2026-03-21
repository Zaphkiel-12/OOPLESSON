/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4Code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Addition extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblSum;
    private JTextField txtFirstNum, txtSecondNum;
    private JButton btnSum;
    
    Addition(){
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Calculator");
        lblHeader.setBounds(100, 50, 100, 30);
        add(lblHeader);
        
        txtFirstNum = new JTextField("0");
        txtFirstNum.setBounds(50, 100, 50, 30);
        add(txtFirstNum);
        
        txtSecondNum = new JTextField("0");
        txtSecondNum.setBounds(150, 100, 50, 30);
        add(txtSecondNum);
        
        lblSum = new JLabel("Sum is 0");
        lblSum.setBounds(250, 100, 100, 30);
        add(lblSum);
        
        btnSum = new JButton("Sum");
        btnSum.setBounds(100, 150, 100, 30);
        add(btnSum);
        
        //Add to ActionListener
        btnSum.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSum){
            
            String firstNum = txtFirstNum.getText();
            String secondNum = txtSecondNum.getText();
            
            if(firstNum.matches("\\d+") && secondNum.matches("\\d+")){
                int Sum = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                lblSum.setText(String.valueOf("Sum is "+Sum));
            }else{
                JOptionPane.showMessageDialog(this, "Only Integers are allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        }
        
    }

    
    
    
}
