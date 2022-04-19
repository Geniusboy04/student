package uz.student.model;

import  lombok.Getter;
import lombok.Setter;
import uz.student.DBTables;
import uz.student.dto.StudentDto;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = DBTables.STUDENT)
public class StudentEntity extends BaseEntity {

    @Column(name = "first_name", nullable = false,length = 100 )
    private String firstName;

    @Column(name = "last_name", nullable = false,length = 100)
    private String lastName;

    @Column(name = "middle_name", nullable = false, length = 100)
    private String middleName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "passport_number", nullable = false,length = 9 )
    private String passportNumber;

    @Column(name = "phone_number", nullable = false )
    private String phoneNumber;

    public StudentDto asDto(){
        StudentDto dto = new StudentDto();
        dto.setId(getId());
        dto.setFirstName(getFirstName());
        dto.setStatus(getStatus());
        dto.setLastName(getLastName());
        dto.setMiddleName(getMiddleName());
        dto.setAddress(getAddress());
        dto.setPassportNumber(getPassportNumber());
        dto.setPhoneNumber(getPhoneNumber());
        return dto;
    }
}