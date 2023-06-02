package inheritance;

public class Car extends Vehicle{
	
	public void engine() {
		System.out.println("Car has engine");
	}
	
	public void start() {
		System.out.println("Start the Car");
	}
	
	public void stop() {
		System.out.println("Stop the Car");
	}
	
	public void refuel() {
		System.out.println("Refuel the Car");
	}
	
	private void fuel() {
		System.out.println("Refuel the Car");
	}
	
	private static void fuels() {
		System.out.println("Refuel the Car");
	}

}
