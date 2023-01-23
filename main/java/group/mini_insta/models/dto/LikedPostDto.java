package group.mini_insta.models.dto;

import group.mini_insta.models.entity.Post;
import group.mini_insta.models.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class LikedPostDto {
    Long id;
    User userId;
    Post postId;
}
