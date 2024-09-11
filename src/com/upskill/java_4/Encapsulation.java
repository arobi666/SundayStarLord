package com.upskill.java_4;

public class Encapsulation {

	// encapsulation used to hide the data using setter and getter method

	private String name = "upskill";

	private int ssn = 97389838;
	private String username = "raselalam";

	// Setter Method - name
	public void setName(String value) {
		name = value;
	}

	// Getter Method - name
	public String getName() {
		return name;
	}

	// Setter Method - ssn
	public void setSSN(int value) {
		ssn = value;
	}

	// Getter Method -username
	public String getUserName() {
		return username;
	}

	int dob = 06012002;
	int dl = 2773893;
	String adress = "Bronx";

	public void setdob(int value) {
		dob = value;
	}

	public int getdl() {
		return dl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
