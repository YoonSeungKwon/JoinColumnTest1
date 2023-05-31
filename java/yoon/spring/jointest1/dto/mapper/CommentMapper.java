package yoon.spring.jointest1.dto.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yoon.spring.jointest1.domain.Comment;
import yoon.spring.jointest1.domain.Member;
import yoon.spring.jointest1.dto.CommentDto;
@Component
@RequiredArgsConstructor
public class CommentMapper {
    private final MemberMapper memberMapper;
    public CommentDto ComToDto(Comment comment){
        CommentDto dto = new CommentDto(
                memberMapper.MemToDto(comment.getWriter()),
                comment.getContent()
        );
        return dto;
    }

}
