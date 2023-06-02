package interfaceExercise;

public class TestFortisHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital f = new FortisHospital();
		f.cardioServices();
		f.oncologyServices();
		f.erServices();
		f.pediaServices();
		f.opServices();
		f.lasikServices();
		f.policies();
		f.years = 15;
		System.out.println(FortisHospital.chairman);
		FortisHospital.boardMembers();
		
		//Top Casting
		
		USMedical u = new FortisHospital();
		
		u.cardioServices();
		u.oncologyServices();
		u.erServices();
		
	}

}
