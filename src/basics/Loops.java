package basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		
		System.out.println();
		
		boolean flag = true;
		int i = 1;
		while(flag) {
			System.out.println(i);
			i++;
			if(i==5) {
				break;
			}
		}
		
		boolean flag1 = false;
		while(flag1) {
			System.out.println();
		}
		
		System.out.println();
		
		//for loops:
		
		int k = 1;
		for(;k<=10;) {
			System.out.println(k);
			k++;
		}
		
		//Print a to z
		for(char c = 'a';c<='z';c++) {
			System.out.println(c + " : " + (int)c);
		}
		
		System.out.println();
		
		//print odd numbers from 1 to 9
		for(int odd=1;odd<=9;odd=odd+2) {
			System.out.println(odd);
		}
		
		System.out.println();
		
		for(int j=1;j<=10;j++) {
			if(j%2==1) {
				System.out.println(j +" is a odd number");
			}
			else if(j%2==0) {
				System.out.println(j +" is a even number");
			}
		}
		
		System.out.println();
		
		//do while loop
		
		int p = 1;
		do {
			System.out.println(p);
			p++;
		}
		while(p<=10);

	}

}
