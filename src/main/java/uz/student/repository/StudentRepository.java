package uz.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.student.model.StudentEntity;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    List<StudentEntity> findStudentEntityByFirstName(String name);

}
