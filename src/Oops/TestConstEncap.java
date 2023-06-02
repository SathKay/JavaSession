package Oops;

public class TestConstEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstEncap e = new ConstEncap("sk","bnm");
		System.out.println(e.getUsername());
		//System.out.println(e.getPassword());
		e.setPassword("bnm123");
		System.out.println(e.getPassword());
		
		System.out.println();
		
		e.doLogin(e.getUsername(), e.getPassword());
		
		System.out.println();
		
		e.doLogin();
		

	}

}
