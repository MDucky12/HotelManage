/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmange.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PS23303_Trung
 */
public class LoginFrame extends JFrame {

    String title;

    public LoginFrame(String title) {
        //Resize
        this.setLayout(new FlowLayout());
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(new Dimension(660, 770));
        this.setLocationRelativeTo(null);
        
        //Add Image
        ImageAvatar img = new ImageAvatar();
        img.setBounds(200, 80, 260, 260);
        ImageIcon icon = new ImageIcon("src\\com\\hotelmanage\\icon\\user.png");
        img.setIcon(icon);
        
        //Add panel
        JPanel pnl = new JPanel();
        pnl.setPreferredSize(new Dimension(460,500));
        pnl.setBackground(Color.red);
        //Add to frame
        add(img);
//        add(new LoginScreen());
        add(pnl);
        
    }
}
