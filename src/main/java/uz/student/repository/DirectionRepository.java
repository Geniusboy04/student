package uz.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.student.model.DirectionEntity;

@Repository
public interface DirectionRepository extends JpaRepository<DirectionEntity, Long> {


}
