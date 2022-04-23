package uz.student.service.impl;

import lombok.AllArgsConstructor;
import  org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.student.dto.DirectionDto;
import uz.student.model.DirectionEntity;
import uz.student.repository.DirectionRepository;
import uz.student.service.DirectionService;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DirectionServiceImpl implements DirectionService {

    private final DirectionRepository directionRepository;

    @Override
    @Transactional(readOnly = true)
    public DirectionDto get(Long id) {
         DirectionEntity direction = directionRepository.getById(id);
        return direction.asDto();
    }

    @Override
    @Transactional(readOnly = true)
    public List<DirectionDto> getList() {
        List<DirectionEntity> direction = directionRepository.findAll();
        return direction.stream().map(DirectionEntity::asDto).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<DirectionDto> getOnlyDirection() {
        List<DirectionEntity> directionEntityList = directionRepository.findAll();
        return directionEntityList.stream().map(DirectionEntity::asDto).collect(Collectors.toList());
    }
}
