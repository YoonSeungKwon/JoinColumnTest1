package yoon.spring.jointest1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yoon.spring.jointest1.domain.Member;
import yoon.spring.jointest1.dto.MemberDto;
import yoon.spring.jointest1.dto.mapper.MemberMapper;
import yoon.spring.jointest1.repository.MemberRepository;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MemberMapper memberMapper;
    public MemberDto save(MemberDto dto){
        Member member = Member.builder()
                        .id(dto.getId())
                        .password(dto.getPassword())
                        .name(dto.getName())
                        .build();
        memberRepository.save(member);
        MemberDto temDto = memberMapper.MemToDto(member);
        return temDto;
    }
}
