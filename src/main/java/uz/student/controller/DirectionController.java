package uz.student.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.student.dto.DirectionDto;
import uz.student.service.DirectionService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("api/")
public class DirectionController {

    private final DirectionService directionService;


    @GetMapping("directions")
    List<DirectionDto> getAllFacultyDirection(){
        return directionService.getList();
    }

    @GetMapping("selection")
    List<DirectionDto> getAllDirection(){
        return directionService.getOnlyDirection();
    }

    @PostMapping("add-direction")
    ResponseEntity<?> save(@RequestBody DirectionDto direction){
        directionService.save(direction);
        return ResponseEntity.ok().body("Saved");
    }


//    @GetMapping("/get/{id}")
//    DirectionDto get(@PathVariable Long id){
//        return directionService.get(id);
//    }

}
