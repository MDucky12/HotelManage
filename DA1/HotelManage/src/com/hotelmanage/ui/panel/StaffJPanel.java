/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.ui.panel;

import com.hotelmanage.utils.ImageAvatar;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author hoang
 */
public class StaffJPanel extends JComponent{
    private ImageIcon icon;
    
    ImageAvatar avatar;

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public ImageAvatar getAvatar() {
        return avatar;
    }

    public void setAvatar(ImageAvatar avatar) {
        this.avatar = avatar;
    }
    
    
    
    public StaffJPanel(){
        
        //create avatar circle
        avatar = new ImageAvatar();
        avatar.setSize(100, 100);
        ImageIcon icon = new ImageIcon("/home/hoang/Desktop/FPOLY/HotelManage/DA1/HotelManage/src/com/hotelmanage/image/5918d8e9040516b65f93c75a9c5b8175.jpg");
        avatar.setIcon(icon);
        
        this.add(avatar);
        this.setVisible(true);
    }
}
