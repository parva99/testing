package com.core.demo;

public class Overloading {
	public int add(int x,int y){return x+y;}  
	public int add(int x,int y,int z){return x+y+z;} 
	
	

	public static void main(String args[]) {
		Overloading ove = new Overloading();

		System.out.println(ove.add(11,11));  
		System.out.println(ove.add(11,11,11));  
	}
}
  