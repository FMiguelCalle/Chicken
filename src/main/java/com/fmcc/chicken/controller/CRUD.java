package com.fmcc.chicken.controller;

import java.io.Serializable;
import java.util.List;

public interface CRUD<T, ID extends Serializable> {
	
	T create (T t);
	
	void delete(T t);
	
	void update (T t);
	
	List<T> getAll();

	T findById(ID id);
	
}