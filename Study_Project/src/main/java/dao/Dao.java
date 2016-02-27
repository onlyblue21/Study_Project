package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.UserVo;

@Repository("ksm.dao.TestDao")
public class Dao{

	@Autowired
	private SqlSession sqlSession;
	
	public int test(){
		return sqlSession.selectOne("ksm.test");
	}
	// Login
	public boolean Login(UserVo uservo){
		int x = sqlSession.selectOne("ksm.Login",uservo);
		return x < 1 ? false:true;
	}
}
