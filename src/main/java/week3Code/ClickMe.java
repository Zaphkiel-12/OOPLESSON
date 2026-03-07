/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3Code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Edmundo Dela Cruz
 */
public class ClickMe extends JFrame implements ActionListener{
    
    private JLabel lblClickme;
    private JButton btnClickMe, btnReset;
    private int count;
    
    
    ClickMe(){
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblClickme = new JLabel("Counter is: "+count);
        lblClickme.setBounds(110, 100, 100, 30);
        add(lblClickme);
        
        btnClickMe = new JButton("Click Me!!!");
        btnClickMe.setBounds(110, 170, 100, 30);
        add(btnClickMe);
        
        btnReset = new JButton("Reset");
        btnReset.setBounds(110, 230, 100, 30);
        add(btnReset);
        
        //Adding Action Listener
        btnClickMe.addActionListener(this);
        btnReset.addActionListener(this);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnClickMe){
            count++;
            lblClickme.setText("Counter is: "+count);
        }else if(e.getSource() == btnReset){
            count = 0;
            lblClickme.setText("Counter is: "+count);
        }
        
    }
    
    
}
