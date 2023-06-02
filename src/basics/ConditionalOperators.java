package basics;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 =12.22;
		double d2 = 12.23;
		
		if(d1==d2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("NOt Equal");
		}
		
		String s1 = "Hello";
		String s2 = "hello";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		String browser = "chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome browser");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Forebox browser");
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.out.println("Edge browser");
		}
		else {
			System.out.println("pass correct browser");
		}
		
		System.out.println();
		
		String browser2 = " Chr ome ";
		
		switch(browser2.toLowerCase().trim().replace(" ", "")) {
		case "chrome":
			System.out.println("Chrome browser");
			break;
		case "firefox":
			System.out.println("Firefox browser");
			break;
		case "edge":
			System.out.println("Edge browser");
			break;
		default:
			System.out.println("pass correct browser");
		}
		
		
			

	}

}
