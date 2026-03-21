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
public class SquarePage extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblSide, lblSquareFormula, lblSquarePerimeter;
    private JButton btnRectangle, btnHome, btnTriangle, btnCircle, btnSubmit;
    private JTextField txtSide;
    int perimeter;
    
    SquarePage(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Square Perimeter Page", SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 600, 30);
        add(lblHeader);
        
        btnRectangle = new JButton("Rectangle");
        btnRectangle.setBounds(40, 100, 100, 30);
        add(btnRectangle);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(180, 100, 100, 30);
        add(btnHome);
        
        btnTriangle = new JButton("Triangle");
        btnTriangle.setBounds(320, 100, 100, 30);
        add(btnTriangle);
        
        btnCircle = new JButton("Circle");
        btnCircle.setBounds(460, 100, 100, 30);
        add(btnCircle);
        
        txtSide = new JTextField("0");
        txtSide.setBounds(250, 200, 100, 30);
        add(txtSide);
        
        lblSide = new JLabel("Side");
        lblSide.setBounds(250, 235, 100, 30);
        add(lblSide);
        
        lblSquareFormula = new JLabel("P =4*side");
        lblSquareFormula.setBounds(460, 200, 150, 30);
        add(lblSquareFormula);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(250, 285, 100, 30);
        add(btnSubmit);
        
        lblSquarePerimeter = new JLabel("Perimeter is "+perimeter);
        lblSquarePerimeter.setBounds(200, 315, 200, 30);
        add(lblSquarePerimeter);
        
        btnHome.addActionListener(this);
        btnRectangle.addActionListener(this);
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
        }else if(e.getSource() == btnRectangle){
            dispose();
            RectanglePage rp = new RectanglePage();
            rp.setVisible(true);
        }else if(e.getSource() == btnTriangle){
            dispose();
            TrianglePage tp = new TrianglePage();
            tp.setVisible(true);
        }else if(e.getSource() == btnCircle){
            dispose();
            CirclePage cp = new CirclePage();
            cp.setVisible(true);
        }else if(e.getSource() == btnSubmit){
            String side = txtSide.getText().trim();
            
            perimeter = 4 * Integer.parseInt(side);
            lblSquarePerimeter.setText("Perimeter is "+perimeter);
        }
    }

    
    
}
