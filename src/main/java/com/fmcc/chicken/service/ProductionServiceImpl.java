package com.fmcc.chicken.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmcc.chicken.dao.ProductionDAO;
import com.fmcc.chicken.model.production.Production;

@Service
public class ProductionServiceImpl implements ProductionService{

	@Autowired
	private ProductionDAO dao;
	
	@Override
	public Production create(Production t) {
		return dao.save(t);
	}

	@Override
	public void delete(Production t) {
		dao.delete(t);
		
	}

	@Override
	public void update(Production t) {
		dao.save(t);
		
	}

	@Override
	public List<Production> getAll() {
		final List<Production> productions = new ArrayList<>();
		dao.findAll().forEach(p -> productions.add(p));
		return productions;
	}

	@Override
	public Production findById(Integer id) {
		return dao.findOne(id);
	}
	
}
