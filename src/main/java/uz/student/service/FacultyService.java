package uz.student.service;

import org.springframework.stereotype.Service;
import uz.student.dto.FacultyDto;
import uz.student.repository.FacultyRepository;

import java.util.List;

@Service
public interface FacultyService {

    List<FacultyDto> getList();

}
