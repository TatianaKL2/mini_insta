package group.mini_insta.models.dto;

import group.mini_insta.models.entity.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class MediaTypeDto {
    Long id;
    String mediaType;
    Post postId;
}
