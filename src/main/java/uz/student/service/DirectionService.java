package uz.student.service;

import  org.springframework.stereotype.Service;
import uz.student.dto.DirectionDto;

import java.util.List;


@Service
public interface DirectionService {

    DirectionDto get(Long id);

    List<DirectionDto> getList();

}
