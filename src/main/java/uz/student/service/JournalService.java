package uz.student.service;


import  org.springframework.stereotype.Service;
import uz.student.dto.JournalDto;
import uz.student.model.JournalEntity;

import java.util.List;

@Service
public interface JournalService {

    double getCountOfPages();

    List<JournalDto> getSmartStudent();

    JournalDto getById(Long id);

    void save(JournalDto journal);

    void delete(Long id);

    void deleteAll(List<JournalEntity> journal);

    List<JournalDto> findPaginated(int pageNo, int pageSize);



}
