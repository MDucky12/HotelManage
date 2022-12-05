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
    private String identify;

    public HMCustomers() {
    }

    public HMCustomers(String idCustomers, String nameCustomers, String phoneNumCustomers, String emailCustomers, String identify) {
        this.idCustomers = idCustomers;
        this.nameCustomers = nameCustomers;
        this.phoneNumCustomers = phoneNumCustomers;
        this.emailCustomers = emailCustomers;
        this.identify = identify;
    }

    public String getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getNameCustomers() {
        return nameCustomers;
    }

    public void setNameCustomers(String nameCustomers) {
        this.nameCustomers = nameCustomers;
    }

    public String getPhoneNumCustomers() {
        return phoneNumCustomers;
    }

    public void setPhoneNumCustomers(String phoneNumCustomers) {
        this.phoneNumCustomers = phoneNumCustomers;
    }

    public String getEmailCustomers() {
        return emailCustomers;
    }

    public void setEmailCustomers(String emailCustomers) {
        this.emailCustomers = emailCustomers;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
    
}
