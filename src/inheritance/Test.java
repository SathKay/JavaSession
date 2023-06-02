package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.fuels();
		b.engine();
		
		System.out.println();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println();
		
		Vehicle v = new Vehicle();
		v.engine();
		
		System.out.println();
		
		//Top-Casting to Car class
		Car ca = new BMW();
		ca.start();
		ca.stop();
		ca.refuel();
		
		
		//Top-casting to Vehicle class
		Vehicle va = new BMW();
		va.engine();
	
		

	}

}
