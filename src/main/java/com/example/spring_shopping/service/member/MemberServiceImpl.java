package com.example.spring_shopping.service.member;

import com.example.spring_shopping.dao.member.MemberDao;
import com.example.spring_shopping.vo.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public List<MemberVo> selectMemberAllList() {

        return memberDao.selectMemberAllList();
    }

    @Override
    public String getTime() {
        return memberDao.selectDbTest();
    }

}
