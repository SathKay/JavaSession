package builderPattern;

public class TestUberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UberApp user1 = new UberApp();
		
		user1.login().searchVehicle("MGM").logout();
		
		System.out.println();
		
		user1.login("SK", "2358jlkp").searchVehicle("cpp").selectVehicle("Skoda").logout();

	}

}
