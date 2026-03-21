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
public class CirclePage extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblSide, lblCircleFormula, lblCirclePerimeter;
    private JButton btnRectangle, btnSquare, btnTriangle, btnHome, btnSubmit;
    private JTextField txtRadius;
    double perimeter;
    
    CirclePage(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Circle Perimeter Page", SwingConstants.CENTER);
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
        
        btnHome = new JButton("Home");
        btnHome.setBounds(460, 100, 100, 30);
        add(btnHome);
        
        txtRadius = new JTextField("0");
        txtRadius.setBounds(250, 200, 100, 30);
        add(txtRadius);
        
        lblSide = new JLabel("Radius");
        lblSide.setBounds(250, 235, 100, 30);
        add(lblSide);
        
        lblCircleFormula = new JLabel("P =2*PI*r");
        lblCircleFormula.setBounds(460, 200, 150, 30);
        add(lblCircleFormula);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(250, 285, 100, 30);
        add(btnSubmit);
        
        lblCirclePerimeter = new JLabel("Perimeter is "+perimeter);
        lblCirclePerimeter.setBounds(200, 315, 200, 30);
        add(lblCirclePerimeter);
        
        btnRectangle.addActionListener(this);
        btnSquare.addActionListener(this);
        btnTriangle.addActionListener(this);
        btnHome.addActionListener(this);
        btnSubmit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnHome){
            dispose();
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }else if(e.getSource() == btnRectangle){
            dispose();
            RectanglePage rp = new RectanglePage();
            rp.setVisible(true);
        }else if(e.getSource() == btnSquare){
            dispose();
            SquarePage sp = new SquarePage();
            sp.setVisible(true);
        }else if(e.getSource() == btnTriangle){
            dispose();
            TrianglePage tp = new TrianglePage();
            tp.setVisible(true);
        }else if(e.getSource() == btnSubmit){
            String radius = txtRadius.getText().trim();
            
            perimeter = 2 * Math.PI * Integer.parseInt(radius);
            lblCirclePerimeter.setText("Perimeter is "+perimeter);
        }
    }

    
    
}
