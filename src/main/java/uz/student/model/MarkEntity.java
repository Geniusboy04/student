package uz.student.model;


import lombok.Getter;
import lombok.Setter;
import uz.student.dto.MarkDto;
import uz.student.model.BaseEntity;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "db_mark")
public class MarkEntity extends BaseEntity {

    @Column(name = "mark", nullable = false)
    private Short mark;

    public MarkDto asDto(){
        MarkDto dto = new MarkDto();
        dto.setId(getId());
        dto.setMark(getMark());
        return dto;
    }
}
