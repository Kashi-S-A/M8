package com.ty.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	private int id;
	private String name;

	@OneToMany(mappedBy = "category")
	private List<Product> produts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Product> getProduts() {
		return produts;
	}

	public void setProduts(List<Product> produts) {
		this.produts = produts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
