package com.testcases;

public class Test1 {
	

	public int add (int n1,int n2) {
		
		return n1+n2;
		
	}
	
	
	public static void main(String[] args) {
		
		String hungry = "yes";
		
		if (hungry == "yes")
			System.out.println("eat Something.......");
		else {
			
			System.out.println("Do work.........");
		}
		Test1 obj = new Test1();
		int haa =obj.add(45, 21);
		System.out.println(haa);
	}
	}
		
		
	


