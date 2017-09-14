package com.fmcc.chicken.model.user;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

import com.fmcc.chicken.model.chicken.Chicken;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String username;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Chicken> chickens;
	
}
