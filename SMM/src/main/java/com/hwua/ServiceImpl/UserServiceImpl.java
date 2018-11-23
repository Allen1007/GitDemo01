package com.hwua.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hwua.Service.UserService;
import com.hwua.dao.UserMapper;
import com.hwua.entity.User;

public class UserServiceImpl implements  UserService{
 
	@Autowired
	private UserMapper usermapper;
	
	public int deleteByPrimaryKey(Integer id) {
		
		return 0;
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectByPrimaryKey(Integer id) {
		User primaryKey = usermapper.selectByPrimaryKey(id);
		return primaryKey;
	}

	public int updateByPrimaryKeySelective(User record) {
	
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		
		return 0;
	}

	public List<User> selectAllUsers() {
		List<User> allUsers = usermapper.selectAllUsers();
		return allUsers;
	}

}
