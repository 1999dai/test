package com.example.springboottest.bean;

import org.apache.tomcat.jni.Address;

public class usr {

private String name;
private String address;
private String phone;
private String emai;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    @Override
    public String toString() {
        return "usr{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", emai='" + emai + '\'' +
                '}';
    }
}
