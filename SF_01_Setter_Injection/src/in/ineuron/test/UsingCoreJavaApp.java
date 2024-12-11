package in.ineuron.test;

import in.ineuron.com.WishMessageGenerator;

public class UsingCoreJavaApp {

	public static void main(String[] args) {
		
		WishMessageGenerator generator = new WishMessageGenerator();
		System.out.println("Target Object Before Setter Injection :: "+generator);
		
		java.util.Date date = new  java.util.Date();
		System.out.println("Dependent Object is :: "+ date);
		
		generator.setDate(date);
		
		System.out.println("Target Object after Setter Ingection :: "+generator);
		
		System.out.println();
		
		String result = generator.generateMessage("Sagar");
		System.out.println(result);
		
	}

}
