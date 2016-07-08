package com.niit.Mhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Mhub.dao.UserDAO;
import com.niit.Mhub.model.SignupModel;

@Service
public class UserServiceimpl implements UserService{
	@Autowired
	UserDAO userDAO;
	public void insertSignupModel(SignupModel u)
	{
		userDAO.insertSignupModel(u);
	}
	

}

