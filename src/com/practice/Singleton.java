package com.practice;

public class Singleton {
	
	// ======Early Instantiation=====
	//A private Constructor prevents any other class from instantiating
	private static Singleton sgltn = new Singleton();
	
	/* Static 'instance' method */
	private Singleton() {}
	
	/* Other methods protected by singleton-ness */
	public static Singleton getInstance() {
		if (sgltn == null) {
			sgltn = new Singleton();
		}
		return sgltn;
	}
	
	public static void main(String[] args) {
		Singleton sgltn1 = Singleton.getInstance();
	}
	

}
