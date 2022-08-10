package com.ank.oops;
class Teacher {
	   String designation = "Asst. Professor";
	   String collegeName = "Acharya Institute of Technology";
	   void does(){
		System.out.println("Teaching");
	   }
	}

	public class inheritance extends Teacher{
	   String mainSubject = "VLSI design";
	   public static void main(String args[]){
		inheritance obj = new inheritance();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	   }
	}

