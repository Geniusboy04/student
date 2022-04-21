package uz.student.service.impl;


import lombok.AllArgsConstructor;
import  org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.student.dto.StudentDto;
import uz.student.enums.Status;
import uz.student.model.StudentEntity;
import uz.student.repository.StudentRepository;
import uz.student.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    @Transactional(readOnly = true)
    public List<StudentDto> getAllStudent(){
        List<StudentEntity> student = studentRepository.findAll();
        return student.stream().map(StudentEntity::asDto).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void save(StudentDto student) {
        StudentEntity studentEntity;
        if(student.getId() == null){
            studentEntity = new StudentEntity();
        }else {
            studentEntity = studentRepository.getById(student.getId());
        }
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());
        studentEntity.setPassportNumber(student.getPassportNumber());
        studentEntity.setPhoneNumber(student.getPhoneNumber());
        studentRepository.save(studentEntity);
    }

    @Override
    @Transactional
    public StudentDto get(Long id) {
        StudentEntity student = studentRepository.getById(id);
        return student.asDto();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        StudentEntity studentEntity = studentRepository.getById(id);
        studentEntity.setStatus(Status.DELETED);
        studentRepository.save(studentEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<StudentDto> searchByName(String name) {
        List<StudentEntity> studentEntity = studentRepository.findStudentEntityByFirstName(name);
        return studentEntity.stream().map(StudentEntity::asDto).collect(Collectors.toList());
    }
}
