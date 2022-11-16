/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.main;

import com.hotelmanage.ui.button.RoomButton;
import javax.swing.JFrame;

/**
 *
 * @author hoang
 */

//This frame for test
public class MyFrame extends JFrame{

    public MyFrame(){
        RoomButton btn1 = new RoomButton();
        btn1.setSize(200, 70);
        btn1.setRadius(50);
        btn1.setBorder(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(btn1);
    }
    
}
