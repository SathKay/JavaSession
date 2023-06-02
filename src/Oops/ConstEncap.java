package Oops;

public class ConstEncap {
	
	private String username;
	private String password;
	
	public ConstEncap(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	
	//Methods for business logic
	public void doLogin(String username, String password) {
		System.out.println("Username : "+ username);
		System.out.println("Password : "+ password);
		System.out.println("Click on Login button");
		System.out.println("Logged In");
	}
	
	//sso(Single Sign On application) Login
	public void doLogin() {
		System.out.println("Username : "+ this.username);
		System.out.println("Password : "+this.password);
		System.out.println("Logged In");
	}
	

}
