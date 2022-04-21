package uz.student.controller;

import  lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.student.dto.StudentDto;
import uz.student.service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("students")
    List<StudentDto> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("student/save")
    ResponseEntity<?> save(@RequestBody StudentDto student){
        studentService.save(student);
        return ResponseEntity.ok().body("Success");
    }

    @DeleteMapping("student/delete/{id}")
    ResponseEntity<?> delete(@PathVariable("id") Long id){
        studentService.delete(id);
        return ResponseEntity.ok().body("Deleted");
    }

    @GetMapping("student/{id}")
    StudentDto getById(@PathVariable("id") Long id){
        return studentService.get(id);
    }

    @GetMapping("student/search/{name}")
    List<StudentDto> search(@PathVariable("name") String name){
        return studentService.searchByName(name);
    }
}
