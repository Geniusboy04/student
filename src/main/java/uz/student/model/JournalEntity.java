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
    @JoinColumn(name = "direction_id")
    private DirectionEntity direction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private CourseEntity course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private SubjectEntity subject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mark_id")
    private MarkEntity mark;

    public JournalDto asDto(){
        JournalDto dto = new JournalDto();
        dto.setId(getId());
        dto.setStudent(getStudent().asDto());
        dto.setDirection(getDirection().asJournalDto());
        dto.setCourse(getCourse().asDto());
        dto.setSubject(getSubject().asDto());
        dto.setMark(getMark().asDto());
        return dto;
    }
}
