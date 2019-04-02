/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeeproject.domain.model;

import javax.persistence.*;

/**
 *
 * @author 宋觅源
 */
@Entity
@Table(name="Address")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    @Column(name = "ID")
    private int id;

    @Column(name = "Street")
    private String street;
    
    @Column(name = "City")
    private String city;
    
    @Column(name = "State")
    private String state;
    
    @Column(name = "ZipCode")
    private int zipCode;
    
    @Column(name = "Country")
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int ZipCode) {
        this.zipCode = ZipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
