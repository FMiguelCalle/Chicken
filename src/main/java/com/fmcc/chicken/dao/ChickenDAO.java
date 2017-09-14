package com.fmcc.chicken.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fmcc.chicken.model.chicken.Chicken;

@Repository
public interface ChickenDAO extends PagingAndSortingRepository<Chicken, Integer>{

}
