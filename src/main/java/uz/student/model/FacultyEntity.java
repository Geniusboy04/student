package uz.student.model;


import lombok.Getter;
import lombok.Setter;
import  uz.student.dto.FacultyDto;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "db_faculty")
public class FacultyEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true, length = 100 )
    private String name;

    public FacultyDto asDto(){
        FacultyDto dto = new FacultyDto();
        dto.setId(getId());
        dto.setName(getName());
        return dto;
    }
}
