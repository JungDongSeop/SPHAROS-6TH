package com.jungdongseop.spharos6th.member.infrastructure;

import com.jungdongseop.spharos6th.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}