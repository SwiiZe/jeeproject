
package jeeproject.domain.repository;

import jeeproject.domain.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
    
}
