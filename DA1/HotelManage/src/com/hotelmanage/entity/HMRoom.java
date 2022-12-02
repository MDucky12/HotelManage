/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMRoom {
    private int idRoom;
    private String nameRoom;
    private boolean status;
    private String idFloor;
    private String idTypeRoom;

    public HMRoom() {
    }

    public HMRoom(int idRoom, String nameRoom, boolean status, String idFloor, String idTypeRoom) {
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.status = status;
        this.idFloor = idFloor;
        this.idTypeRoom = idTypeRoom;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public boolean isStatus() {
        return status;
    }

    public String getIdFloor() {
        return idFloor;
    }

    public String getIdTypeRoom() {
        return idTypeRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setIdFloor(String idFloor) {
        this.idFloor = idFloor;
    }

    public void setIdTypeRoom(String idTypeRoom) {
        this.idTypeRoom = idTypeRoom;
    }
    
    
}
