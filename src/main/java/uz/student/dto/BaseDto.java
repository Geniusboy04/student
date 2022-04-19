package uz.student.dto;


import lombok.Getter;
import lombok.Setter;
import uz.student.enums.Status;

@Setter
@Getter
public class BaseDto {

    private Long id;

    private Status status = Status.ACTIVE;

}
