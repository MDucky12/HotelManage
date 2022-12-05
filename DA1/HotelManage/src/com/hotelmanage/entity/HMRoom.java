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
<<<<<<< HEAD
<<<<<<< HEAD

    private String idRoom;
    private boolean status;
    private String RoomFloor;
    private String RoomType;
    private float RoomPrice;
=======
    private int idRoom;
    private String nameRoom;
    private boolean status;
    private String idFloor;
    private String idTypeRoom;
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
    private int idRoom;
    private String nameRoom;
    private boolean status;
    private String idFloor;
    private String idTypeRoom;
>>>>>>> parent of 9f5f870... Update DAO & Entity

    public HMRoom() {
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public HMRoom(String idRoom, boolean status, String RoomFloor, String RoomType, float RoomPrice) {
=======
    public HMRoom(int idRoom, String nameRoom, boolean status, String idFloor, String idTypeRoom) {
>>>>>>> parent of 9f5f870... Update DAO & Entity
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.status = status;
        this.idFloor = idFloor;
        this.idTypeRoom = idTypeRoom;
    }

    public int getIdRoom() {
        return idRoom;
    }

<<<<<<< HEAD
    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
=======
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
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
    public String getNameRoom() {
        return nameRoom;
>>>>>>> parent of 9f5f870... Update DAO & Entity
    }

    public boolean isStatus() {
        return status;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void setStatus(boolean status) {
        this.status = status;
=======
    public String getIdFloor() {
        return idFloor;
>>>>>>> parent of 9f5f870... Update DAO & Entity
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
<<<<<<< HEAD

=======
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
    
    
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
    
    
>>>>>>> parent of 9f5f870... Update DAO & Entity
}
