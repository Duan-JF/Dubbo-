package org.example.domain;

import java.io.Serializable;

public class Address implements Serializable {
    private static final long serialVersionUID = 6655789445055919874L;
    //城市
    private String city;
    //街道
    private String street;
   //邮编
    private String zipcode;
    //手机号
    private String number;
    //默认使用地址
    private String user;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", number='" + number + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
