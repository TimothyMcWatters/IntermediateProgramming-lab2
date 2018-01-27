/**
This program:
handles setting up vacation plans.
-creates a class that uses an inheritance
-uses abstract and concrete classes
-write abstract methods
-overwrite abstract methods 

@author Timothy McWatters
@version 1.0

COP3022    Lab 2
File Name: VacationTester.java
*/

public class VacationTester {

	public static void main(String[] args) {
		// create an array used to call and compare budgets for our Vacation's 
		Vacation[] vacationBudgetCompare = new Vacation[10];
		
		// create a default and a parameterized instance of each subclass, 4 total
		AllInclusive vacation1 = new AllInclusive();
		AllInclusive vacation2 = new AllInclusive("St. Thomas", 5000.00, "Sandals", 5, 4300.00);
		ALaCarte vacation3 = new ALaCarte();
		ALaCarte vacation4 = new ALaCarte("Mackinac Island", 5000.00, "The Grand Hotel", 1750.00, "Delta", 1200.00, 1000.00);
		
		// set the instance variables from the default constructors
		vacation1.setDestination("Mexico");
		vacation1.setBudget(5000.00);
		vacation1.setBrand("Four Seasons");
		vacation1.setRating(4); 
		vacation1.setPrice(7500.00);  
		vacation3.setDestination("California");
		vacation3.setBudget(5000.00);
		vacation3.setHotelName("Beverly Hills Hotel");
		vacation3.setRoomCost(7500.00); 
		vacation3.setAirline("United"); 
		vacation3.setAirfare(1500.00); 
		vacation3.setMeals(2000.00); 
		
		//testing the rest of the getter methods
		System.out.println("A vacation to " + vacation1.getDestination() + ", and staying at the " + vacation1.getBrand() + " which has a " + vacation1.getRating() + " rating would be off budget by " + vacation1.budgetBalance() + " dollars.");
		System.out.println("A vacation to " + vacation2.getDestination() + ", and staying at the " + vacation2.getBrand() + " which has a " + vacation2.getRating() + " rating would be off budget by " + vacation2.budgetBalance() + " dollars.");
		System.out.println("A vacation to " + vacation3.getDestination() + ", and staying at the " + vacation3.getHotelName() + ", flying via " + vacation3.getAirline() + " would be off budget by " + vacation3.budgetBalance() + " dollars.");
		System.out.println("A vacation to " + vacation4.getDestination() + ", and staying at the " + vacation4.getHotelName() + ", flying via " + vacation4.getAirline() + " would be off budget by " + vacation4.budgetBalance() + " dollars.");
	
		//testing the Vacation superclass' budgetBalance method simply as a reference to ensure that the later calls are from the subclasses
		System.out.println();
		Vacation vacationSuperclass = new Vacation();
		System.out.println("The Vacation superclass' budgetBalace() method returns the default value of: " + vacationSuperclass.budgetBalance());
		
		//add the 4 Vacation class objects (2 from each sub class) to the array vacationBudgetCompare to have budgetBalance methods called
		vacationBudgetCompare[0] = vacation1;
		vacationBudgetCompare[1] = vacation2;
		vacationBudgetCompare[2] = vacation3;
		vacationBudgetCompare[3] = vacation4;
		//polymorphically calling budgetBalance methods from collection of the Vacation objects
		System.out.println();
		for (int i = 0; i < vacationBudgetCompare.length; i++) {
			if (vacationBudgetCompare[i] != null) {
				System.out.println("Vacation " + (i+1) + " is off budget by " + vacationBudgetCompare[i].budgetBalance() + " Dollars.");
			}
		}
	}
}
