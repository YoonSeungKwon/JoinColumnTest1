package yoon.spring.jointest1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yoon.spring.jointest1.domain.Comment;
import yoon.spring.jointest1.domain.Member;
import yoon.spring.jointest1.dto.CommentDto;
import yoon.spring.jointest1.repository.CommentRepository;
import yoon.spring.jointest1.repository.MemberRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final MemberRepository memberRepository;
    public List<Comment> load(){
        return commentRepository.findAll();
    }
    public String save(String id, String password, String content){

        Member member = memberRepository.findById(id);

        if(member == null){
            return "E1";
        }
        if(!member.getPassword().equals(password)){
            return "E2";
        }
        Comment comment = Comment.builder()
                .writer(member)
                .content(content)
                .build();

        commentRepository.save(comment);

        return "Y";
    }

}
