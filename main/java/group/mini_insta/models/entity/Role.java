package group.mini_insta.models.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class Role {
    @Id
    Long id;
    String name;

     @ManyToOne
     @JoinColumn(name= "user_id")
     User userId;
}
