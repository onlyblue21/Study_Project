package com.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.Dao;
import com.service.Pro_Service;
import com.vo.MemberVo;

@Service("Pro_Service")
public class Pro_ServiceImpl implements Pro_Service{
	
	@Resource
	private Dao dao;
	
	@Override
	public boolean Login(MemberVo membervo) throws Exception {
		return dao.Login(membervo);
	}
	
	@Override
	public int memberjoin(MemberVo membervo) throws Exception{
		
		return dao.memberjoin(membervo);
	}
	
}
