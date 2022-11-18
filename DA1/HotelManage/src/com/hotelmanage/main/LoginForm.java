/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.main;

import com.hotelmange.utils.LoginFrame;
import java.awt.EventQueue;

/**
 *
 * @author PS23303_Trung
 */
public class LoginForm {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LoginFrame("LOGIN FORM").setVisible(true);
            }
        });

    }
}
