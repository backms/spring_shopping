package com.example.spring_shopping.service.member;

import com.example.spring_shopping.vo.member.MemberVo;

import java.util.List;

public interface MemberService {

    List<MemberVo> selectMemberAllList();

    String getTime();

}
