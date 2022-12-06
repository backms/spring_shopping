package com.example.spring_shopping.controller.member;

import com.example.spring_shopping.service.member.MemberService;
import com.example.spring_shopping.vo.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/register")
    public String register(){
        return "member/register";
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

    @PostMapping("/doRegister")
    public String doRegister(MemberVo memberVo, ModelMap model) throws Exception {

        memberService.insertMember(memberVo);

        return "redirect:/";
    }

}
