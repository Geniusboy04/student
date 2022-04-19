package uz.student.model;


import lombok.Getter;
import lombok.Setter;
import uz.student.dto.CourseDto;
import uz.student.model.BaseEntity;

import javax.persistence.*;


@Entity
@Table(name = "db_course")
@Setter
@Getter
public class CourseEntity extends BaseEntity {

    @Column(name = "course", nullable = false)
    private Short course;

    public CourseDto asDto(){
        CourseDto dto = new CourseDto();
        dto.setId(getId());
        dto.setCourse(getCourse());
        return dto;
    }
}
