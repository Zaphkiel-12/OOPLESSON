/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4Code;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Cashier extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblShetSharonCount;
    private JButton btnAddShetSharon, btnMinusShetSharon, btnCalculate;
    private JComboBox<String> cmbShetSharon;
    private JTextArea txaOrder;
    
    private static final String[] Sizes = {"Small", "Medium", "Large"};
    
    private int intShetSharon = 0;
    
    
    Cashier(){
        setSize(800, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Balut APP",SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 800, 30);
        add(lblHeader);
        
        cmbShetSharon = new JComboBox<>(Sizes);
        cmbShetSharon.setBounds(50, 100, 100, 30);
        add(cmbShetSharon);
        
        btnAddShetSharon = new JButton("+");
        btnAddShetSharon.setBounds(200, 100, 50, 30);
        add(btnAddShetSharon);
        
        btnMinusShetSharon = new JButton("-");
        btnMinusShetSharon.setBounds(300, 100, 50, 30);
        add(btnMinusShetSharon);
        
        lblShetSharonCount = new JLabel("0");
        lblShetSharonCount.setBounds(400, 100, 50, 30);
        add(lblShetSharonCount);
        
        txaOrder = new JTextArea();
        txaOrder.setBounds(500, 100, 250, 250);
        txaOrder.setEditable(false);
        add(txaOrder);
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(100, 200, 100, 30);
        add(btnCalculate);
        
        btnAddShetSharon.addActionListener(this);
        btnMinusShetSharon.addActionListener(this);
        btnCalculate.addActionListener(this);
        
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddShetSharon){
            intShetSharon++;
            lblShetSharonCount.setText(String.valueOf(intShetSharon));
        }else if(e.getSource() == btnMinusShetSharon){
            if(intShetSharon > 0){
                intShetSharon--;
                lblShetSharonCount.setText(String.valueOf(intShetSharon));
            }   
        }else if(e.getSource() == btnCalculate){
            double totalCost = 0.0;
            totalCost = calculateCost(intShetSharon, (String) cmbShetSharon.getSelectedItem());
            
            txaOrder.setText("Your Order is/are: "+cmbShetSharon.getSelectedItem()+" ShetSharon * "+intShetSharon+" \n" +
                              "Total is: $"+totalCost+"");
            
        }
    }
    
    
    public double calculateCost(int count, String size){
        double price = 0.0;
        
        switch(size){
            case "Small" -> price = 5.00;
            case "Medium" -> price = 7.50;
            case "Large" -> price = 10.00;
        }
        
        return count * price;
    }
    
}
