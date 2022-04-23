package uz.student.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.student.dto.FacultyDto;
import uz.student.model.FacultyEntity;
import uz.student.repository.FacultyRepository;
import uz.student.service.FacultyService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FaccultyServiceImpl  implements FacultyService {

    private final FacultyRepository facultyRepository;

    @Override
    @Transactional(readOnly = true)
    public List<FacultyDto> getList() {
        List<FacultyEntity> faculty = facultyRepository.findAll();
        return faculty.stream().map(FacultyEntity::asDto).collect(Collectors.toList());
    }
}
