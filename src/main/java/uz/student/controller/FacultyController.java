package uz.student.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.student.dto.FacultyDto;
import uz.student.service.FacultyService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class FacultyController {

    private final FacultyService facultyService;

    @GetMapping("/faculty")
    List<FacultyDto> getFacultyList(){
        return facultyService.getList();
    }
}
