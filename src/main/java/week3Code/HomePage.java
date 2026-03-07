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
public class HomePage extends JFrame implements ActionListener{
    
    private JLabel lblHomePage;
    private JButton btnWelcomePage, btnLoginPage;
    
    HomePage(){
        setSize(300, 300);
        setName("Home Page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHomePage = new JLabel("Home Page");
        lblHomePage.setBounds(100, 50, 100, 30);
        add(lblHomePage);
        
        btnWelcomePage = new JButton("Welcome");
        btnWelcomePage.setBounds(50, 150, 80, 30);
        add(btnWelcomePage);
        
        btnLoginPage = new JButton("Login");
        btnLoginPage.setBounds(160, 150, 80, 30);
        add(btnLoginPage);
        
        btnWelcomePage.addActionListener(this);
        btnLoginPage.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        dispose();
        if(e.getSource() == btnLoginPage){
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
        }else if(e.getSource() == btnWelcomePage){
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
        }
    }
    
}
