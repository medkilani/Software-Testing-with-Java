package com.testcases;



public class Test1 {
	
	
	
	public  int  add(int n1 , int n2) {
		System.out.println(n1+n2);
		return n1+n2;
	}
	
	
	public static void main(String[] args) {
		
		String hungry = "yes";
		
		if (hungry == "yes"||hungry =="Y"||hungry =="y")
			System.out.println("eat Something.......");
		else {
			
			System.out.println("Do work.........");
		}
		Test1 ob =new Test1();
		ob.add(10, 20);
		
	}

}
