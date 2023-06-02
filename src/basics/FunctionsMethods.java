package basics;

import java.util.ArrayList;

public class FunctionsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsMethods br = new FunctionsMethods();
		boolean flag = br.openBrowser("safari");
		System.out.println(flag);
		
		//FunctionsMethods br1 = new FunctionsMethods();
		Object info[] = br.getCompanyDetails("IBM");
		for(Object e : info) {
			System.out.println(e);
		}
		
		ArrayList<String> prods = br.getProductDetails("nykaa");
		System.out.println(prods);
	}
	
	public boolean openBrowser(String name) {
		
		System.out.println("The browser name entered by the user is " + name);
		boolean flag = false;
		switch(name.toLowerCase()) {
		case "chrome":
			System.out.println("Launch Chrome");
			flag = true;
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			flag = true;
			break;
		default:
			System.out.println("Please enter correct browser name");
			flag = false;
			break;
		}
		return flag;
	}
	
	public Object[] getCompanyDetails(String compName) {
		System.out.println("The COmpany Name entered by the user is "+ compName);
		Object i[] = new Object[4];
		
		if(compName.equals("IBM")) {
			i[0] = "IBM";
			i[1] = 2013;
			i[2] = 150000;
			i[3] = "Approved";
		}
		else if(compName.equals("MS")) {
			i[0] = "MS";
			i[1] = 2010;
			i[2] = 1.5;
			i[3] = "Approved"; 
		}
		else {
			System.out.println("The given company is not available");
		}
		return i;
	}
	
	public ArrayList<String> getProductDetails(String compName){
		System.out.println("The company entered by the User is " + compName);
		ArrayList<String> prod = new ArrayList<String>();
		
		switch(compName.toLowerCase()) {
		case "amazon":
			prod.add("Laptop");
			prod.add("Fashion");
			break;
		case "nykaa":
			prod.add("Cosmetics");
			prod.add("Skincare");
			prod.add("Jewellary");
			prod.add("Fashion");
			break;
		case "flipkart":
			prod.add("Zara");
			prod.add("H&M");
			prod.add("fgh");
			break;
		default:
			System.out.println("Please enter company name");
			break;
		}
		return prod;
	}

}
