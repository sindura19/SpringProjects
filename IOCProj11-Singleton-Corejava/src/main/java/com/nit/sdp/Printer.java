package com.nit.sdp;

public class Printer {
	//static reference variable -step 2	
	private static Printer INSTANCE;
	
	//private constructor --step 1
	private Printer() {
		System.out.println("Printer:: 0 param constructor)");
	}
		
	//public factory method
	public static Printer getInstance() {
		if(INSTANCE==null)
				INSTANCE=new Printer();
		
		return INSTANCE;
	}
	//Business method
	public void print(String msg) {
		System.out.println(msg);
	}
}
