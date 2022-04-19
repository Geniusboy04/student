package uz.student.model;


import lombok.Getter;
import lombok.Setter;
import  uz.student.dto.SubjectDto;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "db_subject")
public class SubjectEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true, length = 100 )
    private String name;

    public SubjectDto asDto(){
        SubjectDto dto = new SubjectDto();
        dto.setId(getId());
        dto.setName(getName());
        return dto;
    }
}
