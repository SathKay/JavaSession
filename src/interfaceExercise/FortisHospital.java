package interfaceExercise;

public class FortisHospital extends FortisHead implements USMedical, UKMedical, IndianMedical {
	
	@Override
	public void oncologyServices() {
		System.out.println("Ongology Services of Fortis Hospital from US Medical");
	}
	
	@Override
	public void cardioServices() {
		System.out.println("CArdio Services of Fortis Hospitals from US Medical");
	}
	
	@Override
	public void erServices() {
		System.out.println("ER Services of Fortis Hospitals from US Medical");
	}
	
	@Override
	public void pediaServices() {
		System.out.println("Pedia Services of Fortis Hospitala from UK Medical");
	}
	
	@Override
	public void orthoServices() {
		System.out.println("Ortho Services of Fortis Hospital from UK Medical");
	}
	
	@Override
	public void opServices() {
		System.out.println("OP services of Fortis Hospital from Indian Medical");
	}
	
	public void lasikServices() {
		System.out.println("Lasik Services of Fortis Hospital");
	}

}
