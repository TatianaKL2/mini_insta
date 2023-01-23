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
@Table(name = "tb_sub_comment")
public class SubComment extends BaseDate{
    @Id
    Long id;
    String text;
    @ManyToOne
    @JoinColumn(name = "comment_id")
    Comment commentId;
}
