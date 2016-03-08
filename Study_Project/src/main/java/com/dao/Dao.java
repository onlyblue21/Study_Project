package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.MemberVo;

@Repository("Dao")
public class Dao {

	@Autowired
	private SqlSession sqlSession;
	
	
	public boolean Login(MemberVo membervo) throws Exception{
		int x = sqlSession.selectOne("Login", membervo);
		return x < 1 ? false : true;
	}
	
	public int memberjoin(MemberVo membervo) throws Exception{
		
		return sqlSession.insert("memberjoin", membervo);
	}
	
}
