package yoon.spring.jointest1.dto;

import lombok.Getter;

@Getter
public class MemberDto {
    private String id;
    private String password;
    private String name;

    public MemberDto(String id, String password, String name){
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
