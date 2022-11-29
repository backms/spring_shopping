package com.example.spring_shopping.controller.member;

import com.example.spring_shopping.service.member.MemberService;
import com.example.spring_shopping.vo.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/memberAll")
    public String memberAll(Model model) {

        List<MemberVo> memberList = memberService.selectMemberAllList();

        model.addAttribute("memberList", memberList);

        return "member/memberList";
    }

    @GetMapping("/dbTest")
    public String dbTest(Model model) {

        String time = memberService.getTime();

        model.addAttribute("time", time);

        return "member/dbTest";

    }

}
