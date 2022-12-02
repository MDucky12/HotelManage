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
    private int idRoom;
    private String idBranch;

    public HMService() {
    }

    public HMService(int idService, String nameService, String priceService, int idRoom, String idBranch) {
        this.idService = idService;
        this.nameService = nameService;
        this.priceService = priceService;
        this.idRoom = idRoom;
        this.idBranch = idBranch;
    }

    public int getIdService() {
        return idService;
    }

    public String getNameService() {
        return nameService;
    }

    public String getPriceService() {
        return priceService;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public String getIdBranch() {
        return idBranch;
    }
    
}
