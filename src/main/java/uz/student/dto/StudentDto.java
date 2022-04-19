package uz.student.dto;

import lombok.Getter;
import lombok.Setter;
import uz.student.enums.Status;

@Setter
@Getter
public class StudentDto extends BaseDto {

    private String firstName;

    private String lastName;

    private String middleName;

    private String address;

    private String passportNumber;

    private String phoneNumber;

}
