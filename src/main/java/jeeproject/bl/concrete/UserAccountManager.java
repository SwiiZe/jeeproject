package jeeproject.bl.concrete;

import jeeproject.domain.model.Address;
import jeeproject.domain.model.Type;
import jeeproject.domain.model.UserAccount;
import jeeproject.domain.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class UserAccountManager {
    
    private UserAccountRepository repo;
    
    @Autowired
    public UserAccountManager(UserAccountRepository uarepo) {
        this.repo = uarepo;
    }
    
    public UserAccount getUserAccountById(int id) {
        return this.repo.findById(id).get();
    }
    
    
    

    // xiu gai
    public void setUserAccount(String firstName,String lastName,String email,String password,String phone,String userActive,Date creationDate,Date lastModificationDate,String resetPasswordLink,Date resetLinkValidateDate,String isRemoved,String administrator,String owner,String client,String street,String city,String state,int zipCode,String country) 
    {
        UserAccount user= new UserAccount();
        
        Type type=new Type() ;
        type.setAdministrator(administrator);
        type.setClient(client); 
        type.setOwner(owner);
        
        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setCountry(country);
        address.setState(state);
        address.setZipCode(zipCode);
        
        
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        user.setUserActive(userActive);
        user.setCreationDate(creationDate);
        user.setLastModificationDate(lastModificationDate);
        user.setResetPasswordLink(resetPasswordLink);
        user.setResetLinkValidateDate(resetLinkValidateDate);
        user.setIsRemoved(isRemoved);
        
        user.setAddress(address);
        user.setType(type);
        
         repo.save(user);

    }
    
    public UserAccount getUserAccountByEmail(String email) {
        
        return this.repo.findByEmail( email);
    }
    
     
}
