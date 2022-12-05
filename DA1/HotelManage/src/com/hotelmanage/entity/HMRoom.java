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

    public HMRoom() {
    }

<<<<<<< HEAD
    public HMRoom(String idRoom, boolean status, String RoomFloor, String RoomType, float RoomPrice) {
        this.idRoom = idRoom;
        this.status = status;
        this.RoomFloor = RoomFloor;
        this.RoomType = RoomType;
        this.RoomPrice = RoomPrice;
    }

    public String getIdRoom() {
        return idRoom;
    }

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
    }

    public boolean isStatus() {
        return status;
    }

<<<<<<< HEAD
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRoomFloor() {
        return RoomFloor;
    }

    public void setRoomFloor(String RoomFloor) {
        this.RoomFloor = RoomFloor;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public float getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(float RoomPrice) {
        this.RoomPrice = RoomPrice;
    }

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
}
