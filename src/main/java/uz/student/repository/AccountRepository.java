package uz.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.student.model.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,Long> {
}
