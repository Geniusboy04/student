package uz.student.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JournalDto extends BaseDto {

    private StudentDto student;

    private DirectionDto direction;

    private CourseDto course;

    private SubjectDto subject;

    private MarkDto mark;

}
