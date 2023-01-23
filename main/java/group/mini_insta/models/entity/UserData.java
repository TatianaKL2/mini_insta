package group.mini_insta.models.entity;

import group.mini_insta.models.enums.Gender;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_user_data")
public class UserData extends BaseDate{

    @Id
    Long id;
    String photo;
    String name;
    String about;
    String email;
    @Enumerated(EnumType.STRING)
    Gender gender;
    String phone;
    @Column(name = "birth_date")
    Date birthDate;


}
