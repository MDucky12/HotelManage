/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.utils;

//import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author duchmps23300
 */
public class Frame extends JFrame {

    public Frame() {
        //Set up JFrame
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1116, 700);
//        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        //
        JPanel pnlWest = new JPanel();
        JPanel pnlEast = new JPanel();
        JPanel pnlIcon = new JPanel();
        JPanel pnlBtn01 = new JPanel();
        JPanel pnlBtn02 = new JPanel();
        JPanel pnlBtn03 = new JPanel();
        JPanel pnlBtn04 = new JPanel();
        JPanel pnlBtn05 = new JPanel();
        JPanel pnlBtn06 = new JPanel();
        JPanel pnlBtn07 = new JPanel();
        JPanel pnlBtn08 = new JPanel();
        JPanel pnlBtn09 = new JPanel();
        JPanel pnlBtn10 = new JPanel();

        //
        JLabel buldingIcon = new JLabel();

//        pnlIcon.setBackground(Color.red);
        pnlEast.setLayout(new CardLayout());
        pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
        pnlWest.add(pnlIcon);
        pnlWest.add(pnlBtn01);
        pnlWest.add(pnlBtn02);
        pnlWest.add(pnlBtn03);
        pnlWest.add(pnlBtn04);
        pnlWest.add(pnlBtn05);
        pnlWest.add(pnlBtn06);
        pnlWest.add(pnlBtn07);
        pnlWest.add(pnlBtn08);
        pnlWest.add(pnlBtn09);
        pnlWest.add(pnlBtn10);

        pnlBtn01.setBackground(Color.red);
        pnlBtn02.setBackground(Color.blue);
        pnlBtn03.setBackground(Color.pink);
        pnlBtn04.setBackground(Color.green);
        pnlBtn05.setBackground(Color.orange);
        pnlBtn06.setBackground(Color.black);
        pnlBtn07.setBackground(Color.yellow);
        pnlBtn08.setBackground(Color.gray);
        pnlBtn09.setBackground(Color.LIGHT_GRAY);
        pnlBtn10.setBackground(Color.MAGENTA);
        // pnlIcon.setPreferredSize(new Dimension(this.getWidth(), 10));
        //  pnlBtn01.setPreferredSize(new Dimension(this.getWidth(), 10));

        this.add(pnlEast, BorderLayout.EAST);
        this.add(pnlWest, BorderLayout.WEST);

        pnlEast.setPreferredSize(new Dimension(900, 700));
        pnlWest.setPreferredSize(new Dimension(216, 700));
        pnlWest.setBackground(new Color(0x1C1427));
        pnlEast.add(new MainScreen());

        buldingIcon.setIcon(readImg("\\com\\hotelmanage\\icon\\Building.png"));
        buldingIcon.setText("");
        pnlIcon.add(buldingIcon);

        //readImg("/com/hotelmanager/image/Building.png");
    }

    private ImageIcon readImg(String url) {
        try {
            ImageIcon image = new ImageIcon(
                    getClass().getResource(url));
            return image;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

}
