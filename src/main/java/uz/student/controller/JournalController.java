package uz.student.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.student.dto.JournalDto;
import uz.student.model.JournalEntity;
import uz.student.service.JournalService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class JournalController {

    private final JournalService journalService;

    @GetMapping("/count-of-pages")
    public double getCountOfStudents(){
        return journalService.getCountOfPages();
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

    @PostMapping("/deleteAll")
    public String deleteAll(@RequestBody List<JournalEntity> journalEntities) {
        journalService.deleteAll(journalEntities);
        return "All Students deleted successfully";
    }

    @GetMapping("/journal/{pageNo}/{pageSize}")
    public List<JournalDto> getPaginatedCountries(@PathVariable int pageNo,
                                                  @PathVariable int pageSize) {

        return journalService.findPaginated(pageNo, pageSize);
    }
}
