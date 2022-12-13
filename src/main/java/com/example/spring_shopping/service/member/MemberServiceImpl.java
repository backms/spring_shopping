package com.example.spring_shopping.service.member;

import com.example.spring_shopping.dao.member.MemberDao;
import com.example.spring_shopping.vo.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    MemberDao memberDao;
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public MemberServiceImpl(MemberDao memberDao, BCryptPasswordEncoder passwordEncoder){
        this.memberDao = memberDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void insertMember(MemberVo memberVo) throws Exception {

        memberVo.setPassword(passwordEncoder.encode(memberVo.getPassword()));

        memberDao.insertMember(memberVo);
    }

}
