package uz.student.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.student.dto.JournalDto;
import uz.student.model.JournalEntity;
import uz.student.repository.JournalRepository;
import uz.student.service.JournalService;

import java.util.ArrayList;
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
    public List<JournalDto> getSmartStudent() {
        List<JournalEntity> journalEntities = journalRepository.getBy();
            return journalEntities.stream().map(JournalEntity::asDto).collect(Collectors.toList());
    }


    @Override
    @Transactional(readOnly = true)
    public JournalDto getById(Long id) {
        JournalEntity journalEntity = journalRepository.getById(id);
        return journalEntity.asDto();
    }

    @Override
    @Transactional
    public void save(JournalDto journal) {
        JournalEntity journalEntity;
        if(journal.getId() == null){
            journalEntity = new JournalEntity();
        }else {
            journalEntity = journalRepository.getById(journal.getId());
        }
        journalEntity.getStudent().setFirstName(journal.getStudent().getFirstName());
        journalEntity.getStudent().setLastName(journal.getStudent().getLastName());
        journalEntity.getDirection().setCode(journal.getDirection().getCode());
        journalEntity.getCourse().setCourse(journal.getCourse().getCourse());
        journalRepository.save(journalEntity);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        journalRepository.deleteById(id);
    }
}
