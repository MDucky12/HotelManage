/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmange.utils;

//import java.awt.BorderLayout;
import com.hotelmanage.ui.panel.RoomJPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author duchmps23300
 */
public class Frame extends JFrame {
    String title;

    public Frame(String title) {
        this.setTitle(title);
        // JPanel panelIcon = new JPanel();
//        this.setLayout(new FlowLayout());
//        this.add(panel, BorderLayout.EAST);
//        panel.setPreferredSize(new Dimension(800, 700));

        NotiPoint np = new NotiPoint();
        JPanel pnlLeft = new JPanel();
        
        JPanel pnl1 = new JPanel();
        
//        pnl1.setSize(350, 100);
//        pnl1.setSize(new Dimension(350, 100));
        pnl1.setBounds(0, 0, 350, 100);
        pnl1.setBackground(Color.red);
//        pnl1.setVisible(true);
        
        pnlLeft.setBounds(0, 0, 350, 700);
//        pnlLeft.setBackground(new Color(255,0,0));
        
//        
//        RoomJPanel pnlX = new RoomJPanel();
//        pnlX.setCountRoom(12);
//        pnlX.setFloor(2);
//        pnlX.setBounds(50, 50, 500, 200);


        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setSize(1116, 700);
        //this.setVisible(true);
        this.setLocationRelativeTo(null);
//        panel.setBackground(new Color(0xFFFFFF));
        add(np);
//        this.add(pnlLeft);
//        this.getContentPane().setBackground(new Color(0x1C1427));

    }
       

}
