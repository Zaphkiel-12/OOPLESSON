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
public class RectanglePage extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblLength, lblWidth, lblRectangleFormula, lblRectanglePerimeter;
    private JButton btnHome, btnSquare, btnTriangle, btnCircle, btnSubmit;
    private JTextField txtlength, txtWidth;
    int perimeter;
    
    RectanglePage(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Rectangle Perimeter Page", SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 600, 30);
        add(lblHeader);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(40, 100, 100, 30);
        add(btnHome);
        
        btnSquare = new JButton("Square");
        btnSquare.setBounds(180, 100, 100, 30);
        add(btnSquare);
        
        btnTriangle = new JButton("Triangle");
        btnTriangle.setBounds(320, 100, 100, 30);
        add(btnTriangle);
        
        btnCircle = new JButton("Circle");
        btnCircle.setBounds(460, 100, 100, 30);
        add(btnCircle);
        
        txtlength = new JTextField("0");
        txtlength.setBounds(150, 200, 100, 30);
        add(txtlength);
        
        txtWidth = new JTextField("0");
        txtWidth.setBounds(350, 200, 100, 30);
        add(txtWidth);
        
        lblLength = new JLabel("Length");
        lblLength.setBounds(150, 235, 100, 30);
        add(lblLength);
        
        lblWidth = new JLabel("Width");
        lblWidth.setBounds(350, 235, 100, 30);
        add(lblWidth);
        
        lblRectangleFormula = new JLabel("P =2*(l+w)");
        lblRectangleFormula.setBounds(460, 200, 150, 30);
        add(lblRectangleFormula);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(250, 285, 100, 30);
        add(btnSubmit);
        
        lblRectanglePerimeter = new JLabel("Perimeter is "+perimeter);
        lblRectanglePerimeter.setBounds(200, 315, 200, 30);
        add(lblRectanglePerimeter);
        
        btnHome.addActionListener(this);
        btnSquare.addActionListener(this);
        btnTriangle.addActionListener(this);
        btnCircle.addActionListener(this);
        btnSubmit.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnHome){
            dispose();
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }else if(e.getSource() == btnSquare){
            dispose();
            SquarePage sp = new SquarePage();
            sp.setVisible(true);
        }else if(e.getSource() == btnTriangle){
            dispose();
            TrianglePage tp = new TrianglePage();
            tp.setVisible(true);
        }else if(e.getSource() == btnCircle){
            dispose();
            CirclePage cp = new CirclePage();
            cp.setVisible(true);
        }else if(e.getSource() == btnSubmit){
            String lenght = txtlength.getText().trim();
            String width = txtWidth.getText().trim();
            
            perimeter = Integer.parseInt(lenght) + Integer.parseInt(width);
            lblRectanglePerimeter.setText("Perimeter is "+perimeter);
        }
    }

    
    
}
