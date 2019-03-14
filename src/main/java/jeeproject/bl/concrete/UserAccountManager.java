package jeeproject.bl.concrete;

import jeeproject.domain.model.UserAccount;
import jeeproject.domain.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
