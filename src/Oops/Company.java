package Oops;

import java.util.ArrayList;

public class Company {
	
	String name;
	int id;
	ArrayList<String> prod;
	boolean review;
	
	public Company(String name) {
		this.name = name;
	}
	
	public Company(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Company(String name, int id, ArrayList<String> prod, boolean review) {
		this.name = name;
		this.id = id;
		this.prod = prod;
		this.review = review;
	}

}
