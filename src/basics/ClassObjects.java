package basics;

public class ClassObjects {
	
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassObjects e1 = new ClassObjects();
		e1.name = "SK";
		e1.age = 26;
		e1.salary = 85.5;
		
		ClassObjects e2 = new ClassObjects();
		e2.name = "Tim";
		e2.age = 28;
		e2.salary = 90;
		
		ClassObjects e3 = new ClassObjects();
		e3.name = "Henry";
		e3.age = 29;
		e3.salary = 95.5;
		
		System.out.println(e1.name +"  " +e1.age +"  " +e1.salary);
		System.out.println(e2.name+ "  " +e2.age +" " +e2.salary);
		System.out.println(e3.name+ "  " +e3.age+ "  " +e3.salary);
		
		System.out.println();
		
		e1=e2;
		
		System.out.println(e1.name +"  " +e1.age +"  " +e1.salary);
		System.out.println(e2.name+ "  " +e2.age +" " +e2.salary);
		System.out.println(e3.name+ "  " +e3.age+ "  " +e3.salary);
		
		System.out.println();
		
		e2=e3;
		
		System.out.println(e1.name +"  " +e1.age +"  " +e1.salary);
		System.out.println(e2.name+ "  " +e2.age +" " +e2.salary);
		System.out.println(e3.name+ "  " +e3.age+ "  " +e3.salary);
		
		e3=e1;
		
		System.out.println();
		
		System.out.println(e1.name +"  " +e1.age +"  " +e1.salary);
		System.out.println(e2.name+ "  " +e2.age +" " +e2.salary);
		System.out.println(e3.name+ "  " +e3.age+ "  " +e3.salary);
		
		

	}

}
