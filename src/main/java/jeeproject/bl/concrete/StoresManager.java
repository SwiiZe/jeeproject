/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeeproject.bl.concrete;

import java.util.Date;
import jeeproject.domain.model.Address;
import jeeproject.domain.model.Stores;

import jeeproject.domain.repository.StoresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StoresManager {
     private StoresRepository repo;
    
    @Autowired
    public StoresManager(StoresRepository uarepo) {
        this.repo = uarepo;
    }
    
    public Stores getStoresById(int id) {
        return this.repo.findById(id).get();
    }
    

    // insert a BD.
    public void setStores( int Key,
     String  OpeningHours,
     String  Name,
     String  PhoneNumber,
     String  Email,       
     String  Lattitude,    
     String  Longitude,      
     Date  LastModifiedDate,
     int  LastModifiedBy, String street,String city,String state,int zipCode,String country) 
    {
        
        Stores stores= new Stores();
        
        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setCountry(country);
        address.setState(state);
        address.setZipCode(zipCode);
        
        stores.setEmail(Email);
        stores.setKey(Key);
        stores.setLastModifiedBy(LastModifiedBy);
        stores.setLastModifiedDate(LastModifiedDate);
        stores.setLattitude(Lattitude);
        stores.setLongitude(Longitude);
        stores.setName(Name);
        stores.setOpeningHours(OpeningHours);
        stores.setPhoneNumber(PhoneNumber);
        
        stores.setAddress(address);
        
         repo.save(stores);

    }
    
}
