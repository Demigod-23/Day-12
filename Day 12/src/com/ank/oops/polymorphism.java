package com.ank.oops;

class polymorphism1 {
	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}  
	}  
class polymorphism{  
	public static void main(String[] args){  
	System.out.println(polymorphism1.add(11,11));  
	System.out.println(polymorphism1.add(11,11,11));  
	}

}
