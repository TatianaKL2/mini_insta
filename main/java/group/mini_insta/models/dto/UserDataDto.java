package group.mini_insta.models.dto;

import group.mini_insta.models.enums.Gender;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class UserDataDto {
    Long id;
    String photo;
    String name;
    String about;
    String email;
    Gender gender;
    String phone;
    Date birthDate;
}
