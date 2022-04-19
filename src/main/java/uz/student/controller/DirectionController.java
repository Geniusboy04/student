package uz.student.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.student.service.DirectionService;


@RestController
@AllArgsConstructor
@RequestMapping("/direction")
public class DirectionController {

    private final DirectionService directionService;


//    @GetMapping("/all")
//    List<DirectionDto> getAllDirection(){
//        return directionService.getList();
//    }
//
//    @GetMapping("/get/{id}")
//    DirectionDto get(@PathVariable Long id){
//        return directionService.get(id);
//    }

}
