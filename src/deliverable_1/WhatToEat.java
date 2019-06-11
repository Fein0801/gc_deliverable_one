package deliverable_1;

import java.util.Scanner;

public class WhatToEat {

    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);

	int partySize = 0;
	char menuInput;

	String eventType = "";
	String result = "";
	String foodType = "";
	String preparation = "";

	boolean validEntries = true;

	// Prompt the user for input
	System.out.println("Please enter the event type (choose a number):");
	System.out.println("    0: Casual");
	System.out.println("    1: Semi-Casual");
	System.out.println("    2: Formal");

	// Arrow for ease of use
	System.out.print("> ");

	menuInput = userInput.next().charAt(0);

	// Menu selection
	switch (menuInput) {
	case '0':
	    eventType = "casual";
	    foodType = "sandwiches";
	    break;
	case '1':
	    eventType = "semi-casual";
	    foodType = "fried chicken";
	    break;
	case '2':
	    eventType = "formal";
	    foodType = "chicken parmesan";
	    break;
	default:
	    System.out.println("Please choose one of the 3 menu options.");
	    validEntries = false;
	    break;
	}

	// If previous entry was not valid, don't do the work
	if (validEntries) {
	    System.out.println("Please enter the number of people joining you:");
	    System.out.print("> ");

	    partySize = userInput.nextInt();

	    if (partySize == 1) {
		preparation = "in the microwave.";
	    } else if ((1 < partySize) && (partySize < 13)) {
		preparation = "in your kitchen.";
	    } else if (13 <= partySize) {
		preparation = "by a caterer.";
	    } else {
		System.out.println("Your party cannot have less than 1 person.");
		validEntries = false;
	    }
	}


	// Only print a result if entries were valid
	if (validEntries) {

	    result = "Since you're hosting a " + eventType + " event with " + partySize;

	    if (partySize == 1) {
		result = result.concat(" participant,");
	    } else {
		result = result.concat(" participants,");
	    }

	    result = result + " you should serve " + foodType + " prepared " + preparation;
	}

	System.out.println(result);

	userInput.close();

    }

}
