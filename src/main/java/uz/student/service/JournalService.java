package uz.student.service;


import  org.springframework.stereotype.Service;
import uz.student.dto.JournalDto;

import java.util.List;

@Service
public interface JournalService {

    List<JournalDto> getJournal();

    List<JournalDto> getSmartStudent();

    JournalDto getById(Long id);

    void save(JournalDto journal);

    void delete(Long id);





}
