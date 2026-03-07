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
public class LoginPage extends JFrame implements ActionListener{
    
    private JLabel lblHomePage;
    private JButton btnWelcomePage, btnHomePage;
    
    LoginPage(){
        setSize(300, 300);
        setName("Login Page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHomePage = new JLabel("Login Page");
        lblHomePage.setBounds(100, 50, 100, 30);
        add(lblHomePage);
        
        btnWelcomePage = new JButton("Welcome");
        btnWelcomePage.setBounds(50, 150, 80, 30);
        add(btnWelcomePage);
        
        btnHomePage = new JButton("Home");
        btnHomePage.setBounds(160, 150, 80, 30);
        add(btnHomePage);
        
        btnWelcomePage.addActionListener(this);
        btnHomePage.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        dispose();
        if(e.getSource() == btnHomePage){
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }else if(e.getSource() == btnWelcomePage){
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
        }
    }
    
}
