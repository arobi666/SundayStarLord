package com.upskill.java_4;

public class Constructor {
	
	/* 
	 * Constructor is an instance of the class, a method with the same name as the class.
	 * Java will execute the constructor first.
	 * - Constructor cannot be static, overridden, or have a void or return type.
	 * - Default Constructor: No arguments are passed.
	 * - Parameterized Constructor: Takes arguments.
	 * - Constructor overloading: Multiple constructors with different signatures.
	 */
	
	String studentName;
	int studentAge;
	
	// Default Constructor
	public Constructor() {
		studentName = "Unknown";
		studentAge = 0;
	}
	
	// Parameterized Constructor
	public Constructor(String name) {
		studentName = name;
	}
	
	// Parameterized Constructor with age
	public Constructor(String name, int age) {
		studentName = name;
		studentAge = age;
	}
	
	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		System.out.println("Default Constructor: " + obj1.studentName + ", Age: " + obj1.studentAge);
		
		Constructor obj2 = new Constructor("Upskill");
		System.out.println("Parameterized Constructor (Name): " + obj2.studentName);
		
		Constructor obj3 = new Constructor("Upskill", 25);
		System.out.println("Parameterized Constructor (Name, Age): " + obj3.studentName + ", Age: " + obj3.studentAge);
	}
}
