package net.custom.webapp.repository;

import net.custom.webapp.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, String>
{
}
