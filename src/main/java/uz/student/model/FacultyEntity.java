package uz.student.model;


import lombok.Getter;
import lombok.Setter;
import  uz.student.dto.FacultyDto;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "db_faculty")
public class FacultyEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true, length = 100 )
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "direction_id")
    private Set<DirectionEntity> direction = new HashSet<>();



    public FacultyDto asDto(){
        FacultyDto dto = new FacultyDto();
        dto.setId(getId());
        dto.setName(getName());
        for(DirectionEntity directionDto : direction){
            directionDto.asDto();
        }
        return dto;
    }
}
