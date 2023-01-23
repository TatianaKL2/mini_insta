package group.mini_insta.models.dto;

import group.mini_insta.models.entity.Comment;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class SubCommentDto {
    Long id;
    String text;
    Comment commentId;
}
