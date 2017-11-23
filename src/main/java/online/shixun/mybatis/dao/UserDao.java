package online.shixun.mybatis.dao;

import java.util.List;

import online.shixun.mybatis.model.User;

public interface UserDao {

	/*
	 * 根据id查询用户信息
	 */
	User findUser(int id);
	/*
	 * 查询所有用户信息
	 */
	List<User> findUsers();
	/*
	 * 修改用户信息
	 */
	int updateUser(User user);
	/*
	 * 添加用户
	 */
	int addUser(User user);
	/*
	 * 删除指定id的用户信息
	 */
	int deleteUser(int id);
}
