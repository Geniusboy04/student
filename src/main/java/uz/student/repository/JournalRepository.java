package uz.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.student.model.JournalEntity;

import java.util.List;


@Repository
public interface JournalRepository extends JpaRepository<JournalEntity,Long> {

    @Query(value = "select * from db_journal j inner join db_course c on c.id=j.course_id inner join db_student s on s.id=j.student_id where j.grade=100",nativeQuery = true)
    List<JournalEntity> getBy();

}
