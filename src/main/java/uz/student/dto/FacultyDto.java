package uz.student.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class FacultyDto extends BaseDto {

    private String name;

    private Set<DirectionDto> direction = new HashSet<>();

}
