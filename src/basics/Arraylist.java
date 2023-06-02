package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		System.out.println(a.get(0));
		
		
		a.add(20);
		
		a.add(1,100);
		
		System.out.println(a.get(1));
		
		a.add(30);
		
		System.out.println(a.get(2));
		
		System.out.println();
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println();
		
		System.out.println(a.size());
		
		a.remove(1);
		
		System.out.println();
		
		System.out.println(a.size());
		
		System.out.println(a.get(1));
		
		a.add(null);
		
		System.out.println(a.size());
		
		System.out.println(a.get(2));
		
		a.add("MArk");
		
		System.out.println(a.get(4));
		
		System.out.println("------------------------");
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(100);
		a1.add(200);
		
		for(int e:a1) {
			System.out.println(e);
		}
		
		System.out.println();
		
		ArrayList<Double> a2 = new ArrayList<Double>();
		
		a2.add(22.2);
		
		for(double e:a2) {
			System.out.println(e);
		}
		
		System.out.println("-----");
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("Tom");
		a3.add("Mark");
		a3.add("Tim");
		
		for(String e : a3) {
			System.out.println(e);
		}
		
		System.out.println(a3.size());
		
		System.out.println("--------------------");
		
		ArrayList<Object> ob = new ArrayList<Object>();
		
		ob.add("SK");
		ob.add(26);
		ob.add('F');
		ob.add(100);
		ob.add(85.5);
		
		for(Object e:ob) {
			System.out.println(e);
		}
		
		System.out.println();
		
		System.out.println(ob);
		
		System.out.println("-----------------------------");
		
		Collections.sort(a3);
		System.out.println(a3);
		
		for(String e:a3) {
			System.out.println(e);
		}
		
		System.out.println();
		
		Collections.sort(a3,Collections.reverseOrder());
		System.out.println(a3);
		
		System.out.println();
		
		for(int i=ob.size()-1;i>=0;i--) {
			System.out.println(ob.get(i));
		}
		
		ob.addAll(a3);
		System.out.println(ob);
		
		
		//Declaration and initiation of ArrayList in single line
		//List<String> data = Arrays.asList("Captian", "Maura", "Daniel");
		//List<Integer> data2 = Arrays.asList(10,20,30);
		
		
		int d = 10; //literal
		int dd[] = {10,20,30}; //integer literal array
		int ddd[] = new int[] {10,20,30}; //array
		
		String s = "hello"; //literal
		String sss[] = {"A", "AA"};
		String ss = new String("hello"); //String Object
		String ssss[] = new String[] {"a", "aa"};
	}

}
