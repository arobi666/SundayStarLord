package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Arrat_Hashmap_Hahset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array store multiple data using index
		
		int age = 30; // Variable
		int [] ageStarLord = new int []{25, 30, 28, 32, 35, 27};// Array
		String []nameStarLord = new String []{"John", "jacob", "Jordan"}; 
		// Array index [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student's age :" +ageStarLord[3]);
		System.out.println("Total Student :"+ageStarLord.length);
		

		
			//Multi-Dimentional Array
			int [][]ageStarLord2D = {{25, 30,28, 32,35,27},
					                 {26,29,30,34}};
			String[][]nameStarLord2D = {{ "John", "jacob", "Jordan"},
					{"Rebeka", "Paris", "Sanjana"}};
			
			System.out.println("student's name 2d : "+nameStarLord2D[0][2]);
			System.out.println("student's age 2d : "+ageStarLord2D[0][2]);
			
			//Hashmap store multiple data using key-value pair, implementation of Map interface
			
			HashMap <String, Integer> Student = new HashMap<String, Integer>();
			

			Student.put("Ahsan", 26);
			Student.put("Arobi", 21);
			Student.put("Elena", 24);
			Student.put("Sani", 19);
			Student.put("Pavel", 23);
			System.out.println("Hashmap Student age: "+ Student.get("Arobi"));
			
			HashMap <String, String> Capital = new HashMap<String, String>();
			
			Capital.put("Bd", "Dhaka");
			//Capital.put(null ,"null key value");

			System.out.println("Hashmap Capital's name : "+ Capital.get(null));
			
			
			//Hashtable store multiple data using key value pair, no duplicate, also is synchronized(only one thread can be modified)
			Hashtable<String, String> Region = new Hashtable < String, String>();

					Region.put("BD", "Asia");
					Region.put("USA", "America");
					
					System.out.println("Region : "+ Region.get("BD"));
				//Hasset store unordered collection containing unique value, Implementation of set interface
					HashSet<String> car = new HashSet<String>();
					car.add ("BMW");
					car.add("Toyota");
					car.add("Audi");
					car.add("Ford");
					System.out.println("Car :" + car);
		}
}

