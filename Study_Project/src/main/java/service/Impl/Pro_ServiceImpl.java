package service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import service.Pro_Service;
import vo.UserVo;
import dao.Dao;

@Service("Pro_Service")
public class Pro_ServiceImpl implements Pro_Service{

	@Resource
	private Dao dao;
	@Override
	public boolean Login(UserVo uservo) throws Exception {
		return dao.Login(uservo);
	}
	
}
