package multilevelInterface;

public class FortisHospital extends UNHG implements USMedical, IndianMedical{
	
	@Override
	public void covidTest() {
		System.out.println("Covid test from WHO");
	}
	
	@Override
	public void vaccination() {
		System.out.println("Vaccination from WHO");
	}
	
	@Override
	public void reports(String patientName) {
		System.out.println("Report for the patient "+patientName);
	}
	
	@Override
	public void policies() {
		System.out.println("Policies from Medical");
	}
	
	@Override
	public void policies(String dept) {
		System.out.println("Policies for the dept "+dept);
	}
	
	@Override
	public void cardioServices() {
		System.out.println("Cardio Services from USMedical");
	}
	
	@Override
	public void oncology() {
		System.out.println("Oncology Services from USMedical");
	}
	
	@Override
	public void opServices() {
		System.out.println("OP Services from IndianMedical");
	}
	
	public void specialServices() {
		System.out.println("Fortis Hospital special services");
	}
	
	public static void billing() {
		System.out.println("Fortis Hospital billing");
	}
	
	//@Override
	//public void ambulance() {
	//	System.out.println("Ambulance Service by US Medical");
	//}

}
