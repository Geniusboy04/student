package uz.student.model;


import lombok.Getter;
import lombok.Setter;
import uz.student.dto.DirectionDto;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "db_direction")
public class DirectionEntity extends BaseEntity {

    @Column(name = "name", nullable = false, length = 100 )
    private String name;

    @Column(name = "code",  length = 10 )
    private String code;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    private FacultyEntity faculty;

    public DirectionDto asOnlyDirectionDto(){
        DirectionDto dto = new DirectionDto();
        dto.setId(getId());
        dto.setName(getName());
        dto.setCode(getCode());
        return dto;
    }

    public DirectionDto asDto(){
        DirectionDto dto = new DirectionDto();
         dto.setId(getId());
        dto.setName(getName());
        dto.setFaculty(getFaculty().asDto());
        return dto;
    }
}
