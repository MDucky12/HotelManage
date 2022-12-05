/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMService {
    private int idService;
    private String nameService;
    private String priceService;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private int idRoom;
    private String idBranch;
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
    private int idRoom;
    private String idBranch;
>>>>>>> parent of 9f5f870... Update DAO & Entity

    public HMService() {
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public HMService(int idService, String nameService, String priceService) {
        this.idService = idService;
        this.nameService = nameService;
        this.priceService = priceService;
=======
    public HMService(int idService, String nameService, String priceService, int idRoom, String idBranch) {
        this.idService = idService;
        this.nameService = nameService;
        this.priceService = priceService;
        this.idRoom = idRoom;
        this.idBranch = idBranch;
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
    public HMService(int idService, String nameService, String priceService, int idRoom, String idBranch) {
        this.idService = idService;
        this.nameService = nameService;
        this.priceService = priceService;
        this.idRoom = idRoom;
        this.idBranch = idBranch;
>>>>>>> parent of 9f5f870... Update DAO & Entity
    }

    public int getIdService() {
        return idService;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void setIdService(int idService) {
        this.idService = idService;
    }

=======
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
>>>>>>> parent of 9f5f870... Update DAO & Entity
    public String getNameService() {
        return nameService;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

=======
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
>>>>>>> parent of 9f5f870... Update DAO & Entity
    public String getPriceService() {
        return priceService;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void setPriceService(String priceService) {
        this.priceService = priceService;
=======
=======
>>>>>>> parent of 9f5f870... Update DAO & Entity
    public int getIdRoom() {
        return idRoom;
    }

    public String getIdBranch() {
        return idBranch;
<<<<<<< HEAD
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
=======
>>>>>>> parent of 9f5f870... Update DAO & Entity
    }
    
}
