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

    public DirectionDto asDto(){
        DirectionDto dto = new DirectionDto();
        dto.setId(getId());
        dto.setName(getName());
        dto.setCode(getCode());
        return dto;
    }
}
