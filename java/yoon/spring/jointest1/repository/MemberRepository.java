package yoon.spring.jointest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yoon.spring.jointest1.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findById(String id);
}