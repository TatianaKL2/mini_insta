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
@Table(name = "tb_post")
public class Post extends BaseDate{

    @Id
    Long id;
    String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User userId;

}
