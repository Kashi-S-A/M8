package com.ty.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private int bid;
	private String name;
	private String address;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
