package com.practice.programs;

import java.util.Comparator;

public class Customer implements Comparator<Customer> {
	private int id;
	private String name;


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
	public int compare(Customer var1, Customer var2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
