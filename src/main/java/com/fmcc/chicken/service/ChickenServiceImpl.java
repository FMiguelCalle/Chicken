package com.fmcc.chicken.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmcc.chicken.dao.ChickenDAO;
import com.fmcc.chicken.model.chicken.Chicken;

@Service
public class ChickenServiceImpl implements ChickenService{

	@Autowired
	private ChickenDAO dao;
	
	@Override
	public Chicken create(Chicken t) {
		return dao.save(t);
	}

	@Override
	public void delete(Chicken t) {
		dao.delete(t);
	}

	@Override
	public void update(Chicken t) {
		dao.save(t);
	}

	@Override
	public List<Chicken> getAll() {
		final List<Chicken> chickens = new ArrayList<>();
		dao.findAll().forEach(c -> chickens.add(c));
		return chickens;
	}

	@Override
	public Chicken findById(Integer id) {
		return dao.findOne(id);
	}

	
	
}
