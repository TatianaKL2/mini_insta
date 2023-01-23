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
@Table(name = "tb_stories")
public class Stories extends BaseDate {

    @Id
    Long id;
    String photo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User userId;

}
