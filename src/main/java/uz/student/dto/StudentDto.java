package uz.student.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDto extends BaseDto {

    private String firstName;

    private String lastName;

    private String passportNumber;

    private String phoneNumber;

}
