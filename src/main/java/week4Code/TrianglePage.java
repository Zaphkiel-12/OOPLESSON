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
public class TrianglePage extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblSide1, lblSide2, lblSide3, lblTriangleFormula, lblTrianglePerimeter;
    private JButton btnRectangle, btnSquare, btnHome, btnCircle, btnSubmit;
    private JTextField txtSide1, txtSide2, txtSide3;
    int perimeter;
    
    TrianglePage(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Triangle Perimeter Page", SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 600, 30);
        add(lblHeader);
        
        btnRectangle = new JButton("Rectangle");
        btnRectangle.setBounds(40, 100, 100, 30);
        add(btnRectangle);
        
        btnSquare = new JButton("Square");
        btnSquare.setBounds(180, 100, 100, 30);
        add(btnSquare);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(320, 100, 100, 30);
        add(btnHome);
        
        btnCircle = new JButton("Circle");
        btnCircle.setBounds(460, 100, 100, 30);
        add(btnCircle);
        
        txtSide1 = new JTextField("0");
        txtSide1.setBounds(75, 200, 100, 30);
        add(txtSide1);
        
        txtSide2 = new JTextField("0");
        txtSide2.setBounds(250, 200, 100, 30);
        add(txtSide2);
        
        txtSide3 = new JTextField("0");
        txtSide3.setBounds(425, 200, 100, 30);
        add(txtSide3);
        
        lblSide1 = new JLabel("Side 1");
        lblSide1.setBounds(75, 235, 100, 30);
        add(lblSide1);
        
        lblSide2 = new JLabel("Side 2");
        lblSide2.setBounds(250, 235, 100, 30);
        add(lblSide2);
        
        lblSide3 = new JLabel("Side 3");
        lblSide3.setBounds(425, 235, 100, 30);
        add(lblSide3);
       
        lblTriangleFormula = new JLabel("P=s1+s2+s3");
        lblTriangleFormula.setBounds(460, 285, 150, 30);
        add(lblTriangleFormula);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(250, 285, 100, 30);
        add(btnSubmit);
        
        lblTrianglePerimeter = new JLabel("Perimeter is "+perimeter);
        lblTrianglePerimeter.setBounds(200, 315, 200, 30);
        add(lblTrianglePerimeter);
        
        btnRectangle.addActionListener(this);
        btnSquare.addActionListener(this);
        btnHome.addActionListener(this);
        btnCircle.addActionListener(this);
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
        }else if(e.getSource() == btnCircle){
            dispose();
            CirclePage cp = new CirclePage();
            cp.setVisible(true);
        }else if(e.getSource() == btnSubmit){
            String side1 = txtSide1.getText().trim();
            String side2 = txtSide2.getText().trim();
            String side3 = txtSide3.getText().trim();
            
            perimeter = Integer.parseInt(side1) + Integer.parseInt(side2) + Integer.parseInt(side3);
            lblTrianglePerimeter.setText("Perimeter is "+perimeter);
        }
    }

    
    
}
