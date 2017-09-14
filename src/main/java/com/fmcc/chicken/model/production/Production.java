package com.fmcc.chicken.model.production;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fmcc.chicken.model.chicken.Chicken;

import lombok.Data;

@Data
@Entity
public class Production {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date production_date;
	
	@Column(columnDefinition = "TINYINT")
	private Integer state;
	
	private Integer price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Chicken chicken;
	
}
