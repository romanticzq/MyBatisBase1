package online.shixun.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import online.shixun.mybatis.dao.UserDao;
import online.shixun.mybatis.model.User;

public class TestSelect extends BaseTest{
	
	public static void main(String[] args) {
		SqlSessionFactory sf=getSqlSessionFactory();
		SqlSession ss=sf.openSession();
		UserDao userDao=ss.getMapper(UserDao.class);
		User user=userDao.findUser(7);
		System.out.println(user.toString());
		ss.commit();
		ss.close();
	}
	
}
