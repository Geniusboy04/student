package uz.student.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.student.dto.JournalDto;
import uz.student.dto.StudentDto;
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

    @GetMapping("/smart-student")
    public List<JournalDto> getSmartStudent(){
        return journalService.getSmartStudent();
    }

    @PostMapping("/add-student")
    ResponseEntity<?> save(@RequestBody JournalDto journal){
        journalService.save(journal);
        return ResponseEntity.ok().body("Success");
    }

    @DeleteMapping("/journal/delete/{id}")
    ResponseEntity<?> delete(@PathVariable("id") Long id){
        journalService.delete(id);
        return ResponseEntity.ok().body("Deleted");
    }



}
