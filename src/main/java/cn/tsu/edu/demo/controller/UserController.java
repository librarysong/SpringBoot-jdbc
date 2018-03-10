package cn.tsu.edu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tsu.edu.demo.domain.User;
import cn.tsu.edu.demo.service.IUserService;

@RestController
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private IUserService userServices;
	@RequestMapping(value="save")
	public String save(String name)
	{
		User user=new User(name);
		userServices.save(user);
		return "saved successfully";
	}
	
	@RequestMapping(value="/get")
	public User get(Long id)
	{
		 User user=userServices.get(id);
		 return user;
	}

}
