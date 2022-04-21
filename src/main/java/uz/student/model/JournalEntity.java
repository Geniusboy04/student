package uz.student.model;

import lombok.Getter;
import lombok.Setter;
import uz.student.dto.JournalDto;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "db_journal")
public class JournalEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private CourseEntity course;


    @Column(name = "grade")
    private Long grade;

    public JournalDto asDto(){
        JournalDto dto = new JournalDto();
        dto.setId(getId());
        dto.setStudent(getStudent().asDto());
        dto.setCourse(getCourse().asDto());
        dto.setGrade(getGrade());
        return dto;
    }
}
