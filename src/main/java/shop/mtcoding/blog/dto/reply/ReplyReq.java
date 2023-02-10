package shop.mtcoding.blog.dto.reply;

import lombok.Getter;
import lombok.Setter;

public class ReplyReq {

    @Setter
    @Getter
    public static class ReplySaveReqDto {
        private Integer boardId;
        private String comment;
    }
}
