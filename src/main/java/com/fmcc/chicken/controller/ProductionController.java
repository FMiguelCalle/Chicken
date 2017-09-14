package com.fmcc.chicken.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fmcc.chicken.model.production.Production;
import com.fmcc.chicken.service.ProductionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/production")
public class ProductionController implements CRUD<Production, Integer>{

	@Autowired
	private ProductionService productionService;
	
	@Override
	@RequestMapping(method = RequestMethod.POST)
	public Production create(@RequestBody Production t) {
		log.info("Intentando crear una produccion.");
		return productionService.create(t);
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody Production t) {
		log.info("Borrando una produccion.");
		productionService.delete(t);
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Production t) {
		log.info("Actualizando una produccion.");
		productionService.update(t);
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public List<Production> getAll() {
		log.info("Recuperando todas las producciones.");
		return productionService.getAll();
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Production findById(@PathVariable("id") Integer id) {
		log.info("Recuperando la produccion " + id + ".");
		return productionService.findById(id);
	}
}
