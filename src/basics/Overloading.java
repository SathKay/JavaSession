package basics;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void test() {
		System.out.println("No parameters");
	}
	
	public void test(int i) {
		System.out.println("One int parameter");
	}
	
	public void test(String i) {
		System.out.println("One string parameter");
	}
	
	public void test(int i, String j) {
		System.out.println("One int parameter and String return");
	}
	
	//Method overloading example1 login
	public void login(String username, String password) {
		
	}
	
	public void login(String username, String password, String role) {
		
	}
	
	public void login(String socialmediaacc, int otp) {
		
	}
	
	//Example2
	public void search(String productname) {
		
	}
	
	public void search(String productname, String color) {
		
	}
	
	public void search(String productname, double prize) {
		
	}
	
	//Example3
	public void payment(int accnumber, String password) {
		
	}
	
	public void payment(String upi, int otp) {
		
	}
	
	public void payment(String phonenumber, String password ) {
		
	}

}
