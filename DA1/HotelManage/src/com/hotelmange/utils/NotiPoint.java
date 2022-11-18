/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmange.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
//import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author duchmps23300
 */
public class NotiPoint extends JPanel {

    private static void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

//        RenderingHints rh = new RenderingHints(
//                RenderingHints.KEY_ANTIALIASING,
//                RenderingHints.VALUE_ANTIALIAS_ON);
//
//        rh.put(RenderingHints.KEY_RENDERING,
//                RenderingHints.VALUE_RENDER_QUALITY);

//        g2d.setRenderingHints(rh);
        
//        g2d.setPaint(new Color(0xFFFFFF));
//        g2d.fillRoundRect(1000, 0, 100, 700, 25, 0);
        g2d.setPaint(new Color(0x1C1427));
        g2d.fillRoundRect(0, 0, 350, 700, 0, 0);
        
        g2d.setPaint(new Color(0xFFFFFF));
        g2d.fillRoundRect(200, 0, 1200, 700, 40, 40);

    }

    @Override
    public void paintComponent(Graphics g) {
        doDrawing(g);
        this.setBounds(0,0,1116, 700);
    }
}
