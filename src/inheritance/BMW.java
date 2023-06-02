package inheritance;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("Start the BMW");
	}
	
	public void autoParking() {
		System.out.println("AutoPark the BMW");
	}
	
	public static void fuels() {
		System.out.println("Fuel the BMW");
	}

}
