package Oops;

public class ConstructorConcept {
	
	String name;
	int age;
	int id;
	
	public ConstructorConcept(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept o = new ConstructorConcept("SK",26);
		System.out.println(o.name);
		System.out.println(o.id);

	}

}
