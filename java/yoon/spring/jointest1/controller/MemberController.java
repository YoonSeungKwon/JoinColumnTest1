package yoon.spring.jointest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import yoon.spring.jointest1.dto.MemberDto;
import yoon.spring.jointest1.service.MemberService;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @PostMapping("/join")
    public String join(MemberDto dto, Model model){
        MemberDto temDto = memberService.save(dto);
        model.addAttribute("member", temDto);
        return "/main";
    }
}
