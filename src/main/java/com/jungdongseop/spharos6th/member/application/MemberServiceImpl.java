package com.jungdongseop.spharos6th.member.application;

import com.jungdongseop.spharos6th.member.infrastructure.MemberRepository;
import com.jungdongseop.spharos6th.member.dto.in.MemberAddDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void addMember(MemberAddDto memberAddDto) {
        memberRepository.save(memberAddDto.toEntity(UUID.randomUUID().toString()));
    }
}