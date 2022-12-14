package com.example.spring_shopping.controller.member;

import com.example.spring_shopping.service.member.MemberService;
import com.example.spring_shopping.vo.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @PostMapping("/doRegister")
    public String doRegister(@ModelAttribute("memberVo") MemberVo memberVo, ModelMap model) throws Exception {

        memberService.insertMember(memberVo);

        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "member/login";
    }

    @PostMapping("/doLogin")
    public String doLogin(MemberVo memberVo, ModelMap model) throws Exception {



        return "redirect:/";
    }

}
