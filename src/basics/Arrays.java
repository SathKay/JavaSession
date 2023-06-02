package basics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array declaration
		int a[] = new int[4];
		
		//intialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		System.out.println(a[3]);
		
		//a[4] = 50;
		//System.out.println(a[4]);
		
		System.out.println();
		
		for(int i =0 ; i<4;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		int l = a.length;
		for(int i = 0; i<=l-1;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("....");
		
		for(int e : a) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		
		String emp[] = new String[3];
		emp[0] = "Mile";
		emp[1] = "Krish";
		
		//System.out.println(Arrays.toString(emp));
		
		System.out.println(emp[2]);
		
		System.out.println("--------------");
		
		double d[] = new double[2];
		
		System.out.println(d[0]);
		
		System.out.println("----------");
		
		char c[] = new char[2];
		
		c[0] = '1';
		
		System.out.println(c[0]);
		
		System.out.println("------");
		
		Object student[] = new Object[5];
		
		student[0] = "Nalini";
		student[1] = 26;
		student[2] = 'A';
		student[3] = 80.5;
		student[4] = true;
		
		for(Object e : student) {
			System.out.println(e);
		}

	}

}
