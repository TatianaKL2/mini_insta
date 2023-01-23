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
@Table(name = "tb_media_type")
public class MediaType extends BaseDate{
    @Id
    Long id;
    String mediaType;
    @ManyToOne
    @JoinColumn(name = "post_id")
    Post postId;
}
