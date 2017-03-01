//Andrew LaRoche
//CSI405 Team 9
//Homework 2


package edu.Albany.Sandwich;

import java.util.Scanner;

public class SandwichDriver {
	public static void main(String[] args){
		int sandwichType;
		double sandwichCost;
		int paymentType;
		double change;
		
		Scanner scan = new Scanner(System.in);
		//Prompt user for sandwich type
		System.out.println("Welcome to The Sandwich Shop!");
        System.out.println("What kind of Sandwich would you like?");
        System.out.println("1 - Buffalo Chicken Sandwich");
        System.out.println("2 - Grilled Chicken Sandwich");
        System.out.println("3 - Roast Beef Sandwich");
        System.out.println("4 - Cancel Order and Exit");
        
        sandwichType = scan.nextInt();
        //Read in sandwichType from user
        sandwichCost = Sandwich.SandwichMaker(sandwichType);
        //Pass the sandwichType to get the cost of sandwich
        Sandwich.Customer(sandwichType);
        //Let customer know what sandwich they chose and the cost of it
        
        //Prompt user for payment options
        System.out.println("How would you like to pay?");
        System.out.println("1 - Exact Cost");
        System.out.println("2 - 10.00");
        System.out.println("3 - 20.00");
        System.out.println("4 - 50.00");
        System.out.println("5 - 100.00");
        
        //Read in payment Type from user
        paymentType = scan.nextInt();
        //Calculate Payment Type
        change = Sandwich.Cashier(paymentType,sandwichCost);
        
        //Give user their change and exit
        System.out.println("Your change is $"+ change);
        System.out.println("Enjoy Your Food!");
        System.exit(0);
        
	}//end main

}//end Class

