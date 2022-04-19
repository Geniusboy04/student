package uz.student.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.student.dto.JournalDto;
import uz.student.service.JournalService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class JournalController {

    private final JournalService journalService;

    @GetMapping("/journal")
    public List<JournalDto> getJournal(){
        return journalService.getJournal();
    }
}
