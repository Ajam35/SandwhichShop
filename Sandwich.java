//Andrew LaRoche
//CSI405 Team 9
//Homework 2

package edu.Albany.Sandwich;

public class Sandwich {

	public static void Customer(int sandwichType){
	//Read out to customer the type of sandwich they chose and the cost
	//Exit if invalid choice
		switch(sandwichType){
		case 1:
			System.out.println("You chose a Buffalo Chicken Sandwich");
			System.out.println("The Buffalo Chicken Sandwich costs $5.99");
			break;
		case 2:
			System.out.println("You chose a Grilled Chicken Sandwich");
			System.out.println("The Grilled Chicken Sandwich costs $6.99");
			break;
        case 3:
        	System.out.println("You chose a Roast Beef Sandwich");
        	System.out.println("The Roast Beef Sandwich costs $4.99");
        	break;
        default :
            System.out.println("Invalid Sandwich Choice");
            System.exit(0);
		}
		
	}
	public static double Cashier(int payment,double sandwichCost){
	//Calculate change from payment option chosen by user
	//Exit if user trys to get free food
		double change = 0;
		switch(payment){
			case 1:
				change = sandwichCost;
				break;
			case 2:
				change = 10.00;
				break;
			case 3:
				change = 20.00;
				break;
			case 4:
				change = 50.00;
				break;
			case 5:
				change = 100.00;
				break;
			default :
				System.out.println("Invalid Payment Option");
				System.exit(0);
		}
		return (change - sandwichCost);
	}
	public static double SandwichMaker(int sandwichType){
	//Get Sandwich cost from user's choice
		double sandwichCost = 0;
		switch(sandwichType){
			case 1:
				sandwichCost = 5.99;
				break;
			case 2:
				sandwichCost = 6.99;
				break;
	        case 3:
	        	sandwichCost = 4.99;
	        	break;
	        default :
	            System.out.println("Invalid Sandwich Choice");
	            System.exit(0);
		}
		return sandwichCost;
		
	}
	 
}
