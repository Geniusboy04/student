package uz.student.model;

import lombok.Getter;
import lombok.Setter;
import uz.student.dto.AccountDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "db_account")
public class AccountEntity extends BaseEntity {

    @Column(name = "name", length = 20, unique = true)
    private String name;

    @Column(name = "email", length = 40, unique = true)
    private String email;

    @Column(name = "password", length = 8, unique = true)
    private String password;

    @Column(name = "phone_number", length = 15, unique = true)
    private String phoneNumber;

    public AccountDto asDto(){
        AccountDto dto = new AccountDto();
        dto.setId(getId());
        dto.setName(getName());
        dto.setEmail(getEmail());
        dto.setPassword(getPassword());
        dto.setPhoneNumber(getPhoneNumber());
        return dto;
    }

}
