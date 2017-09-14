package com.fmcc.chicken.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmcc.chicken.dao.UserDAO;
import com.fmcc.chicken.model.user.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;
	
	@Override
	public User create(User t) {
		return dao.save(t);
	}

	@Override
	public void delete(User t) {
		dao.delete(t);
		
	}

	@Override
	public void update(User t) {
		dao.save(t);
	}

	@Override
	public List<User> getAll() {
		final List<User> users = new ArrayList<>();
		dao.findAll().forEach(u -> users.add(u));
		return users;
	}

	@Override
	public User findById(Integer id) {
		return dao.findOne(id);
	}

}
