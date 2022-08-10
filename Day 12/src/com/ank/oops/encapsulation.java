package com.ank.oops;
public class encapsulation {
	  private String name; 

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	

	  public static void main(String[] args) {
		  encapsulation myObj = new encapsulation();
		    myObj.setName("Ankesh Gupta");
		    System.out.println(myObj.getName()); 
		  }
		}

