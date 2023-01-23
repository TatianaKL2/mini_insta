package group.mini_insta.models.entity;

import group.mini_insta.models.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class Blocked {

    @Id
    Long id;
    //user_id
    //blocked_user_id
    @Enumerated(EnumType.STRING)
    Status status;
}
