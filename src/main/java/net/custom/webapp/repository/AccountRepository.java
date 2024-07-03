package net.custom.webapp.repository;

import net.custom.webapp.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity, String>
{
    Optional<AccountEntity> findAccountEntityByCustomerNumber(Long s);
}
