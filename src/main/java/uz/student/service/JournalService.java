package uz.student.service;


import  org.springframework.stereotype.Service;
import uz.student.dto.JournalDto;

import java.util.List;

@Service
public interface JournalService {

    List<JournalDto> getJournal();

    JournalDto getById(Long id);
//
//    List<JournalDto> search(String name);
//
//    List<JournalDto> sortName();
//
//    List<JournalDto> sortSurname();
//
//    List<JournalDto> sortCourse();
//
//    List<JournalDto> sortMark();
//
//    List<JournalDto> sortDirection();



}
