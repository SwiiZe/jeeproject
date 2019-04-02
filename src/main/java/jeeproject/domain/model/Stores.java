/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeeproject.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 宋觅源
 */
@Entity
@Table(name = "Stores")
public class Stores {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    
    @OneToOne
    @JoinColumn(name="AddressId",referencedColumnName="id")
    private Address  Address;

    private int Key;
    private String  OpeningHours;
    private String  Name;
    private String  PhoneNumber;
    private String  Email;       
    private String  Lattitude;        
    private String  Longitude;      
    private Date  LastModifiedDate;
    private int  LastModifiedBy;       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public int getKey() {
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }

    public String getOpeningHours() {
        return OpeningHours;
    }

    public void setOpeningHours(String OpeningHours) {
        this.OpeningHours = OpeningHours;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLattitude() {
        return Lattitude;
    }

    public void setLattitude(String Lattitude) {
        this.Lattitude = Lattitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public Date getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(Date LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    public int getLastModifiedBy() {
        return LastModifiedBy;
    }

    public void setLastModifiedBy(int LastModifiedBy) {
        this.LastModifiedBy = LastModifiedBy;
    }
    
    
}
