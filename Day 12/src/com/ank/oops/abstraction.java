package com.ank.oops;

abstract class Bike{  
	  abstract void run();  
	}  
	class abstraction extends Bike{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]){  
	 Bike obj = new abstraction();  
	 obj.run();  
	}  
	}  
