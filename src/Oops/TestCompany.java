package Oops;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company obj = new Company("AM");
		System.out.println(obj.name);
		
		System.out.println();
		
		Company obj1 = new Company("FF", 555);
		System.out.println(obj1.name);
		System.out.println(obj1.id);
		System.out.println(obj1.prod);
		System.out.println(obj1.review);
		
		System.out.println();
		
		ArrayList<String> prod = new ArrayList<String>();
		prod.add("Mobile");
		prod.add("Laptop");
		prod.add("PC");
		
		Company obj2 = new Company("SS", 556, prod,true);
		System.out.println(obj2.name);
		System.out.println(obj2.id);
		System.out.println(obj2.prod);
		System.out.println(obj2.review);
		

	}

}
