package cn.tsu.edu.demo.service;

import cn.tsu.edu.demo.domain.User;

public interface IUserService {
	void save(User user);
	User get(Long id);

}
