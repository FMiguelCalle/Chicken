package com.fmcc.chicken.model.chicken;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

import com.fmcc.chicken.model.production.Production;
import com.fmcc.chicken.model.user.User;

@Data
@Entity
public class Chicken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(columnDefinition = "VARCHAR(2)")
	private String type;
	
	private String frecuency;
	
	@OneToMany(mappedBy = "chicken", fetch = FetchType.LAZY)
	private List<Production> productions;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
}
