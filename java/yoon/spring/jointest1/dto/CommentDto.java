package yoon.spring.jointest1.dto;

import lombok.Getter;

@Getter
public class CommentDto {

    private MemberDto dto;
    private String comment;


    public CommentDto(MemberDto dto, String comment){
        this.dto = dto;
        this.comment = comment;
    }


}
