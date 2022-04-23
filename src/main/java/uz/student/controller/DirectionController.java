package uz.student.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


//    @GetMapping("/get/{id}")
//    DirectionDto get(@PathVariable Long id){
//        return directionService.get(id);
//    }

}
