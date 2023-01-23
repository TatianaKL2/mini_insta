package group.mini_insta.models.dto;

import group.mini_insta.models.entity.User;
import group.mini_insta.models.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class BlockedDto {
    Long id;
    User userId;
    User blockedUserId;
    Status status;
}
