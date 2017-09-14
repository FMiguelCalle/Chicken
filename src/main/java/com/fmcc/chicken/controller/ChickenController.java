package com.fmcc.chicken.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fmcc.chicken.model.chicken.Chicken;
import com.fmcc.chicken.service.ChickenService;
import com.fmcc.chicken.service.ChickenServiceImpl;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/chicken")
public class ChickenController implements CRUD<Chicken, Integer>{

	@Autowired
	private ChickenService chickenService;
	
	@Override
	@RequestMapping(method = RequestMethod.POST)
	public Chicken create(@RequestBody Chicken t) {
		log.info("Intentando crear un pollo.");
		return chickenService.create(t);
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody Chicken t) {
		log.info("Borrando pollo.");
		chickenService.delete(t);
		
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Chicken t) {
		log.info("Actualizando pollo.");
		chickenService.update(t);		
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public List<Chicken> getAll() {
		log.info("Recuperando todos los pollos.");
		return chickenService.getAll();
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Chicken findById(@PathVariable("id") Integer id) {
		log.info("Recuperando el pollo " + id + ".");
		return chickenService.findById(id);
	}

	
	
}
