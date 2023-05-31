package yoon.spring.jointest1.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import yoon.spring.jointest1.dto.MemberDto;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_idx")
    private Long idx;
    private String id;
    private String password;
    private String name;
    private String role;
    @CreationTimestamp
    private LocalDateTime regdate;
    @Builder
    public Member(String id, String password, String name, String role){
        this.id = id;
        this.password = password;
        this.name = name;
        this.role = "USER";
    }

}
