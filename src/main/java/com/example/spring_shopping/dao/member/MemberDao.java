package com.example.spring_shopping.dao.member;

import com.example.spring_shopping.vo.member.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

    void insertMember(MemberVo memberVo);

}
