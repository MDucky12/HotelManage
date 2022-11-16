/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.main;

import com.hotelmanage.ui.button.RoomButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hoang
 */
//This frame for test
public class MyFrame extends JFrame {

    private JPanel pnl1;
    private RoomButton[] btn;

    public MyFrame() {
        

        RoomButton btn1 = new RoomButton();
        btn1.setSize(70, 70);
        btn1.setRadius(100);
        btn1.setBorder(null);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                JOptionPane.showMessageDialog(null, "ban da click nut");
                
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(btn1);

    }


}
