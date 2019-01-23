package sut.se.g15.backend.Entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Gender")
public class Gender {
    @Id
    @SequenceGenerator(name = "gender_seq",sequenceName = "gender_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gender_seq")
    @Column(name = "GENDER_ID" ,unique = true, nullable = true)
    private @NonNull Long genderId;
    private  String gender;

    public Long getGenderId() {
        return genderId;
    }

    public void setGenderId(Long genderId) {
        this.genderId = genderId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}