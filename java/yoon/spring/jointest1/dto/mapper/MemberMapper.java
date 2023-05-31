package yoon.spring.jointest1.dto.mapper;

import org.springframework.stereotype.Component;
import yoon.spring.jointest1.domain.Member;
import yoon.spring.jointest1.dto.MemberDto;

@Component
public class MemberMapper {
    public MemberDto MemToDto(Member member){
        MemberDto dto = new MemberDto(member.getId(), member.getPassword(), member.getName());
        return dto;
    }

}
