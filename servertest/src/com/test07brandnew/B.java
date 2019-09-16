package com.test07brandnew;

public class B extends A{
	
	public int x=30;
	
	public B() {
		printMessage();
		x=40;
	}
	
	public void printMessage() {
		System.out.println("B.x="+x);
	}

}
