package uz.student.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DirectionDto extends BaseDto {

    private String name;

    private String code;

    private String groups;

    private FacultyDto faculty;

}
