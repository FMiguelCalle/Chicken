package com.fmcc.chicken.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fmcc.chicken.model.user.User;

@Repository
public interface UserDAO extends PagingAndSortingRepository<User, Integer>{

}
