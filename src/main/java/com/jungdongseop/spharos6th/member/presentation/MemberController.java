package com.jungdongseop.spharos6th.member.presentation;

import com.jungdongseop.spharos6th.member.application.MemberService;
import com.jungdongseop.spharos6th.member.dto.in.MemberAddDto;
import com.jungdongseop.spharos6th.member.vo.MemberSignUpVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/member")
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/sign-up")
    public void singUp(
            @RequestBody MemberSignUpVo memberSignUpVo
    ) {
        memberService.addMember(MemberAddDto.from(memberSignUpVo));
    }
}