package uz.student.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto extends  BaseDto {

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

}
