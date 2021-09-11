package com.joao.dias.dsvendas.dto;

import java.io.Serializable;

import com.joao.dias.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SellerDTO() {
		
	}

	public SellerDTO (Long id, String name) {
		this.name = name;
		this.id = id;
		
	}
	
	
	public SellerDTO (Seller entity) {
		name = entity.getName();
		id = entity.getId();		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
