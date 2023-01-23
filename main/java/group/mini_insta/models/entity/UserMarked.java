package group.mini_insta.models.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_user_marked")
public class UserMarked extends BaseDate{

    @Id
    Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User userId;
    @ManyToOne
    @JoinColumn(name = "post_id")
    Post postId;

}
