package shop.mtcoding.blog.dto.reply;

import lombok.Getter;
import lombok.Setter;

public class ReplyResp {
    @Setter
    @Getter
    public static class ReplyDetailReqDto {
        private Integer id;
        private String comment;
        private Integer user_id;
        private Integer board_id;
        private String username;

    }
}
