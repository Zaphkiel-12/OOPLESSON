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
public class WelcomePage extends JFrame implements ActionListener{
    
    private JLabel lblWelcomePage;
    private JButton btnLoginPage, btnHomePage;
    
    WelcomePage(){
        setSize(300, 300);
        setName("Welcome Page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblWelcomePage = new JLabel("Welcome Page");
        lblWelcomePage.setBounds(100, 50, 100, 30);
        add(lblWelcomePage);
        
        btnLoginPage = new JButton("Login");
        btnLoginPage.setBounds(50, 150, 80, 30);
        add(btnLoginPage);
        
        btnHomePage = new JButton("Home");
        btnHomePage.setBounds(160, 150, 80, 30);
        add(btnHomePage);
        
        btnLoginPage.addActionListener(this);
        btnHomePage.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        dispose();
        if(e.getSource() == btnLoginPage){
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
        }else if(e.getSource() == btnHomePage){
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }
    }
    
}
