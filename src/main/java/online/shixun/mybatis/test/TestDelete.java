package online.shixun.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import online.shixun.mybatis.dao.UserDao;

public class TestDelete extends BaseTest{

	public static void main(String[] args) {
		SqlSessionFactory sf=getSqlSessionFactory();
		SqlSession ss=sf.openSession();
		UserDao userDao=ss.getMapper(UserDao.class);
		userDao.deleteUser(6);
		System.out.println(111);
		ss.commit();
		ss.close();
	}
	
}
