package com.practice.programs;

import java.util.Comparator;

public class Customer implements Comparator {
	private int id;
	private String name;

	// @Override
	// public String toString() {
	// return "Customer [id=" + id + ", name=" + name + "]";
	// }

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compare(Object var1, Object var2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
