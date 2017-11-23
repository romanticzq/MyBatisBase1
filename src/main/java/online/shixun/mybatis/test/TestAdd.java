package online.shixun.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import online.shixun.mybatis.dao.UserDao;
import online.shixun.mybatis.model.User;

public class TestAdd extends BaseTest{

	public static void main(String[] args) {
		SqlSessionFactory sf=getSqlSessionFactory();
		SqlSession ss=sf.openSession();
		UserDao userDao=ss.getMapper(UserDao.class);
		userDao.addUser(new User("小红",18,"重庆"));
		System.out.println(111);
		ss.commit();
		ss.close();
	}
	
}
