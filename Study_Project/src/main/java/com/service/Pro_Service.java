package com.service;

import java.util.List;
import java.util.Map;

import com.vo.MemberVo;

public interface Pro_Service {
	
	public boolean Login(MemberVo membervo) throws Exception;
	
	public int memberjoin(MemberVo membervo) throws Exception;
	
}
