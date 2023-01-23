package group.mini_insta.models.entity;

import group.mini_insta.models.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_user")
public class User {

    @Id
    Long id;
    String login;
    String password;
    @Enumerated(EnumType.STRING)
    Status status;
    @OneToOne
    @JoinColumn(name = "user_data_id")
    UserData userDataId;

}
