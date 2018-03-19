package com.jobhelp.oop;

//======================================================================
//Subject:	Test Class
//Author:	Asadul Haque
//Date:		03/14/2018
//======================================================================

public class Test {

	public static void main(String[] args) {

		//******************************************************************
		//							ANIMAL CLASS
	    //******************************************************************
			
			
			//==============================================================
			// ANIMAL CLASS INSTANTIATION (creating object for animal class)
			//==============================================================		
			
			Animal animal1 = new Animal();
			
			//==============================================================
			// accessing all the animal class properties
			//==============================================================
			
			System.out.println("Printing all the instance variables of animal class\n");
			System.out.println(animal1.food);
			System.out.println(animal1.location);
			System.out.println(animal1.hunger);
			System.out.println(animal1.habitat);
			
			System.out.println("\nCalling all the methods of animal class\n");
			animal1.eat();
			animal1.makeNoise();
			animal1.sleep();
			animal1.roam();
		

		//******************************************************************
		//					ANIMALGETTERSETTER CLASS
		//******************************************************************
		
			//==============================================================
			// ANIMALGETTERSETTER CLASS INSTANTIATION
			//==============================================================

			AnimalGetterSetter animal2 = new AnimalGetterSetter();
			
			System.out.println("\nPrinting all the instance variables of AnimalGetterSetter class\n");
			System.out.println(animal2.food);
			System.out.println(animal2.location);
			System.out.println(animal2.hunger);
			System.out.println(animal2.habitat);
			
			//==============================================================
			// setting instance variable values using setter
			//==============================================================
			
			animal2.setFood("Fish");
			animal2.setLocation("Asia");
			animal2.setHunger(4);
			animal2.setHabitat("Domestic");

			//==============================================================
			// printing instance variable values by instance variable
			//==============================================================
			
			System.out.println("\nPrinting all the instance variables of AnimalGetterSetter class\n");
			System.out.println(animal2.food);
			System.out.println(animal2.location);
			System.out.println(animal2.hunger);
			System.out.println(animal2.habitat);
			
			//==============================================================
			// printing instance variable values using getter
			//==============================================================
			
			System.out.println("\nPrinting instance variables of AnimalGetterSetter class using getter\n");
			System.out.println(animal2.getFood());
			System.out.println(animal2.getLocation());
			System.out.println(animal2.getHunger());
			System.out.println(animal2.getHabitat());

	}

}
