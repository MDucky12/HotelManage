/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.ui.panel;

import com.hotelmanage.ui.button.RoomButton;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author hoang
 */
public class RoomJPanel extends JPanel {

    private int countRoom;
    private int floor;

    RoomButton RB[];

    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public RoomJPanel() {
        RB = new RoomButton[10];
//        this.setSize(getWidth(), getHeight());
        this.setLayout(new FlowLayout());

        for (int j = 0; j < 10; j++) {
            RB[j] = new RoomButton();
            RB[j].setText("Button" + j);
            RB[j].setSize(80, 50);
            RB[j].setRadius(40);
            this.add(RB[j]);
        }

        this.setVisible(true);

    }
}
