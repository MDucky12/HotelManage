/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmange.utils;

import com.hotelmanage.utils.ImageAvatar;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PS23303_Trung
 */
public class LoginFrame extends JFrame {

    String title;

    public LoginFrame(String title) {
        //Resize
        this.setLayout(new BorderLayout());
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(660, 770);
        this.setLocationRelativeTo(null);
        //Add Image
        ImageAvatar img = new ImageAvatar();
        img.setBounds(200, 80, 100, 100);
        ImageIcon icon = new ImageIcon("src\\com\\hotelmanage\\icon\\user.png");
        img.setIcon(icon);
        //Add 2 panel
        JPanel pnlTop = new JPanel(new CardLayout());
        pnlTop.add(img);
        pnlTop.add(new LoginScreen());
        this.add(pnlTop,BorderLayout.NORTH);
        pnlTop.setPreferredSize(new Dimension(660,340));
//        add(img);
//        add(new LoginScreen());

    }
}
