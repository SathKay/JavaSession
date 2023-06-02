package multilevelInterface;

public interface USMedical extends Medical {
	
	int min_fee = 100;
	public void cardioServices();
	public void oncology();
	
	public static void billing() {
		System.out.println("Billing by US Medical");
	}
	
	default void ambulance() {
		System.out.println("Amulance Services by US Medical");
	}

}
