package shop.mtcoding.blog.dto.reply;

import lombok.Getter;
import lombok.Setter;

public class ReplyResp {
    @Setter
    @Getter
    public static class ReplyDetailRespDto {
        private Integer id;
        private Integer boardId;
        private Integer userId;
        private String comment;
        private String username;

    }
}
