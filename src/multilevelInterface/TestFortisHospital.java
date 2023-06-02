package multilevelInterface;

public class TestFortisHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital f = new FortisHospital();
		f.ambulance();
		f.billing();
		f.healthGuideline();
		f.vaccination();
		f.reports("jj");
		f.policies("surgery");
		f.policies();
		f.cardioServices();
		f.oncology();
		f.opServices();
		System.out.println(FortisHospital.min_fee);
		
		System.out.println();
		
		USMedical us = new FortisHospital();
		us.ambulance();
		USMedical.billing();

	}

}
