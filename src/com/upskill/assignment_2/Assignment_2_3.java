package com.upskill.assignment_2;

public class Assignment_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int number1 = getFirstNumber();
	int number2 = getSecondNumber();
	
	
	if (number1> number2){
		System.out.println("The first number (" + number1 +") is bigger than the second number(" + number2 + ")." );
	}
	else if (number1<number2){
		System.out.println("The second number (" + number2 + ") is bigger than the first number.");
	}
	else {
		System.out.println("Both numbers are equal.");
	}
	}
	
	public static int getFirstNumber(){
		return 30;
	}
	
	public static int getSecondNumber(){
		return 30;
	}
}