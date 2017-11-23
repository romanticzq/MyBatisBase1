package online.shixun.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import online.shixun.mybatis.dao.UserDao;
import online.shixun.mybatis.model.User;

public class TestUpdate extends BaseTest{

	public static void main(String[] args) {
		SqlSessionFactory sf=getSqlSessionFactory();
		SqlSession ss=sf.openSession();
		UserDao userDao=ss.getMapper(UserDao.class);
		userDao.updateUser(new User(8,"小芳",14,"长寿"));
		System.out.println("update complete");
		ss.commit();
		ss.close();
	}
}
