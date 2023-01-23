package group.mini_insta.models.dto;

import group.mini_insta.models.entity.UserData;
import group.mini_insta.models.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class UserDto {
    Long id;
    String login;
    String password;
    Status status;
    UserData userDataId;
}
