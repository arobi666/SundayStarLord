package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();// TODO Auto-generated method stub
/* 
 * Types of loops
 * 1. For Loop - Do again and again upto upper limit
 * 2.While Loop - Do again and again upto condition match
 * 3.Do While Loop - Do action then match condition
 * 4.Infinite Loop - never ending loop
 * 
 */
	}
public static void practiceForLoop(){
	int i;
	for (i =1; i <=10; i ++){
		System.out.println("For Loops number = "+ i);
	}
}
public static void practiceWhileLoop(){
	int i = 1;
	while (i<=10){
		System.out.println("While Loops number =" +i);
		i ++;
	}
}
public static void practiceDoWhileLoop(){
	int i = 1;
	do {
		System.out.println( "Do while Loops Number = "+ i);
		i++;
	}while (i<=0);
	
	
	
}
public static void practiceInfiniteLoop(){
	int i;
	for (i= 1; ; i++){
		System.out.println("Infinite Loops Number ="+i);
	}
}
public static void practiceNestedForLoop(){
	int i;
	int j;
	for (i=1; i<=10;i ++){
		for (j=1; j <=10; j ++){
			int multipicationTable = i*j;
			System.out.print(multipicationTable + " ");
			
		}System.out.println(" ");
	}
	}
}
