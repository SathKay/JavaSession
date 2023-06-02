package Oops;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation profile = new Encapsulation();
		profile.setName("Sk");
		System.out.println(profile.getName());
		
		profile.setInfo("SK", 26, 'F');
		System.out.println(profile.getInfo());

	}

}
