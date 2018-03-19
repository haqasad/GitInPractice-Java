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
		

	}

}
