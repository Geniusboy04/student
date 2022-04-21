package uz.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.student.model.JournalEntity;


@Repository
public interface JournalRepository extends JpaRepository<JournalEntity,Long> {
}
