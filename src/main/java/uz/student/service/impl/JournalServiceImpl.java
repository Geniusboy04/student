package uz.student.service.impl;


import lombok.AllArgsConstructor;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.student.dto.JournalDto;
import uz.student.model.JournalEntity;
import uz.student.repository.JournalRepository;
import uz.student.service.JournalService;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class JournalServiceImpl implements JournalService {

    private final JournalRepository journalRepository;


    @Override
    @Transactional(readOnly = true)
    public List<JournalDto> getJournal()  {
        List<JournalEntity> journalEntities = journalRepository.findAll();
        return journalEntities.stream().map(JournalEntity::asDto).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public JournalDto getById(Long id) {
        JournalEntity journalEntity = journalRepository.getById(id);
        return journalEntity.asDto();
    }

//    @Override
//    public List<JournalDto> search(String name) {
//        List<JournalEntity> journal = journalRepository.queryBy(name);
//        return journal.stream().map(JournalEntity::asDto).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<JournalDto> sortName() {
//        List<JournalEntity> journal = journalRepository.queryByStudent_FirstName();
//        return journal.stream().map(JournalEntity::asDto).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<JournalDto> sortSurname() {
//        List<JournalEntity> journal = journalRepository.queryByStudent_LastName();
//        return journal.stream().map(JournalEntity::asDto).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<JournalDto> sortCourse() {
//        List<JournalEntity> journal = journalRepository.queryByCourse();
//        return journal.stream().map(JournalEntity::asDto).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<JournalDto> sortMark() {
//        List<JournalEntity> journal = journalRepository.queryByMark();
//        return journal.stream().map(JournalEntity::asDto).collect(Collectors.toList());
//    }
//
//    @Override
//    public List<JournalDto> sortDirection() {
//        List<JournalEntity> journal = journalRepository.queryByDirection();
//        return journal.stream().map(JournalEntity::asDto).collect(Collectors.toList());
//    }
}
