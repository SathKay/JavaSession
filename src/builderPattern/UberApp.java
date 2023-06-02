package builderPattern;

public class UberApp {
	
	private String carNum;
	private int tripId;
	
	public UberApp login() {
		System.out.println("Default Login");
		return this;
	}
	
	public UberApp login(String username, String password) {
		System.out.println("Logged in with username : "+ username + " and password : "+password);
		return this;
	}
	
	public UberApp searchVehicle(String location) {
		System.out.println("Searching available vehicles for the location "+ location);
		return this;
	}
	
	public UberApp selectVehicle(String vehicleName) {
		System.out.println("You selected the vehicle "+vehicleName);
		this.tripId = 3456;
		this.carNum ="TN4567";
		System.out.println("Confirming your trip: The Trip Id is "+this.tripId+" and the car number is "+this.carNum);
		return this;
	}
	
	public UberApp logout() {
		System.out.println("Logging out");
		return this;
	}
	
	public int getTripId(){
		return tripId;
	}
	
	public String getcarNum() {
		return carNum;
	}

}
