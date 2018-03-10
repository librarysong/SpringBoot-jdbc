package cn.tsu.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tsu.edu.demo.dao.UserDao;
import cn.tsu.edu.demo.domain.User;

@Service
public class UserServices implements IUserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		
	}

	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		 return userDao.get(id);
		
	}
}
