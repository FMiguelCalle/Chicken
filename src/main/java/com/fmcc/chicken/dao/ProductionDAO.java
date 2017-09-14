package com.fmcc.chicken.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fmcc.chicken.model.production.Production;

@Repository
public interface ProductionDAO extends PagingAndSortingRepository<Production, Integer>{

}
