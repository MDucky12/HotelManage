/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMProperty {
<<<<<<< HEAD

    private String idProperty;
    private String nameProperty;
    private float priceProperty;
=======
    private String idProperty;
    private String nameProperty;
    private float priceProperty;
    private String idBranch;
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869

    public HMProperty() {
    }

<<<<<<< HEAD
    public HMProperty(String idProperty, String nameProperty, float priceProperty) {
        this.idProperty = idProperty;
        this.nameProperty = nameProperty;
        this.priceProperty = priceProperty;
=======
    public HMProperty(String idProperty, String nameProperty, float priceProperty, String idBranch) {
        this.idProperty = idProperty;
        this.nameProperty = nameProperty;
        this.priceProperty = priceProperty;
        this.idBranch = idBranch;
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
    }

    public String getIdProperty() {
        return idProperty;
    }

<<<<<<< HEAD
    public void setIdProperty(String idProperty) {
        this.idProperty = idProperty;
    }

=======
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
    public String getNameProperty() {
        return nameProperty;
    }

<<<<<<< HEAD
    public void setNameProperty(String nameProperty) {
        this.nameProperty = nameProperty;
    }

=======
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
    public float getPriceProperty() {
        return priceProperty;
    }

<<<<<<< HEAD
=======
    public String getIdBranch() {
        return idBranch;
    }

    public void setIdProperty(String idProperty) {
        this.idProperty = idProperty;
    }

    public void setNameProperty(String nameProperty) {
        this.nameProperty = nameProperty;
    }

>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
    public void setPriceProperty(float priceProperty) {
        this.priceProperty = priceProperty;
    }

<<<<<<< HEAD
=======
    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }
    
    
>>>>>>> 450a3dc92676aa5492d31aa9198a3c6244869869
}
