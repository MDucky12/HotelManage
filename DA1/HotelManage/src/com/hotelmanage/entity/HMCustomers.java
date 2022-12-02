/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMCustomers {
    private String idCustomers;
    private String nameCustomers;
    private String phoneNumCustomers;
    private String emailCustomers;
    private String addressCustomers;

    public HMCustomers() {
    }

    public HMCustomers(String idCustomers, String nameCustomers, String phoneNumCustomers, String emailCustomers, String addressCustomers) {
        this.idCustomers = idCustomers;
        this.nameCustomers = nameCustomers;
        this.phoneNumCustomers = phoneNumCustomers;
        this.emailCustomers = emailCustomers;
        this.addressCustomers = addressCustomers;
    }

    public String getIdCustomers() {
        return idCustomers;
    }

    public String getNameCustomers() {
        return nameCustomers;
    }

    public String getPhoneNumCustomers() {
        return phoneNumCustomers;
    }

    public String getEmailCustomers() {
        return emailCustomers;
    }

    public String getAddressCustomers() {
        return addressCustomers;
    }

    public void setIdCustomers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

    public void setNameCustomers(String nameCustomers) {
        this.nameCustomers = nameCustomers;
    }

    public void setPhoneNumCustomers(String phoneNumCustomers) {
        this.phoneNumCustomers = phoneNumCustomers;
    }

    public void setEmailCustomers(String emailCustomers) {
        this.emailCustomers = emailCustomers;
    }

    public void setAddressCustomers(String addressCustomers) {
        this.addressCustomers = addressCustomers;
    }
    
    
}
