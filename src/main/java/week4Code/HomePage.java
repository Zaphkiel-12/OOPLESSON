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
public class HomePage extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblText;
    private JButton btnRectangle, btnSquare, btnTriangle, btnCircle;
    
    HomePage(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Perimeter Home Page", SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 600, 30);
        add(lblHeader);
        
        btnRectangle = new JButton("Rectangle");
        btnRectangle.setBounds(40, 100, 100, 30);
        add(btnRectangle);
        
        btnSquare = new JButton("Square");
        btnSquare.setBounds(180, 100, 100, 30);
        add(btnSquare);
        
        btnTriangle = new JButton("Triangle");
        btnTriangle.setBounds(320, 100, 100, 30);
        add(btnTriangle);
        
        btnCircle = new JButton("Circle");
        btnCircle.setBounds(460, 100, 100, 30);
        add(btnCircle);
        
        lblHeader = new JLabel("Calculate your Perimeter for Rectangle, Square, Triangle and Circle.", SwingConstants.CENTER);
        lblHeader.setBounds(0, 200, 600, 30);
        add(lblHeader);
        
        btnRectangle.addActionListener(this); 
        btnSquare.addActionListener(this); 
        btnTriangle.addActionListener(this); 
        btnCircle.addActionListener(this); 
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnRectangle){
            RectanglePage rp = new RectanglePage();
            rp.setVisible(true);
        }else if(e.getSource() == btnSquare){
            SquarePage sp = new SquarePage();
            sp.setVisible(true);
        }else if(e.getSource() == btnTriangle){
            TrianglePage tp = new TrianglePage();
            tp.setVisible(true);
        }else if(e.getSource() == btnCircle){
            CirclePage cp = new CirclePage();
            cp.setVisible(true);
        }
        
    }

    
    
}
