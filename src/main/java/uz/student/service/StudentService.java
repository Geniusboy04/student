package uz.student.service;

import org.springframework.stereotype.Service;
import uz.student.dto.StudentDto;
import java.util.List;

@Service
public interface StudentService {

    List<StudentDto> getAllStudent();

    void save(StudentDto student);

    StudentDto get(Long id);

    void delete(Long id);

    List<StudentDto> searchByName(String name);

//    List<StudentDto> findByName(String firstName);

//    List<StudentDto> sortName();
//
//    List<StudentDto> sortLastName();
//
//    List<StudentDto> sortMiddleName();

}
