package basics;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Original main method");
		main(1);

	}
	
	public static void main(int i) {
		System.out.println("Main method with " +i);
		main(10,20);
	}
	
	public static void main(int i, int j) {
		System.out.println("Main method with "+ i + " and "+j);
	}

}
