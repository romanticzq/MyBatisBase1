package online.shixun.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import online.shixun.mybatis.dao.UserDao;
import online.shixun.mybatis.model.User;

public class TestSelectAll extends BaseTest{

	public static void main(String[] args) {
		SqlSessionFactory sf=getSqlSessionFactory();
		SqlSession ss=sf.openSession();
		UserDao userDao=ss.getMapper(UserDao.class);
		List<User> list=userDao.findUsers();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		ss.commit();
		ss.close();
	}
}
