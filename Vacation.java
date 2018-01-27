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
File Name: Vacation.java
*/

public class Vacation {
	private String destination = "";
	private double budget = 0.0;
	
	/**
	 * Default constructor for Vacation class
	 */
	public Vacation() {
		this.destination = "";
		this.budget = 0.0;
	} // end of default Vacation class constructor 
	
	/**
	 * Parameterized constructor for Vacation class
	 * @param destination - Name of the vacation destination
	 * @param budget - The total vacation budget
	 */
	public Vacation(String destination, double budget) {
		this.destination = destination;
		this.budget = budget;
	} // end of parameterized Vacation class constructor 

	/**
	 * returns the destination string
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	} // end of getDestination() method

	/**
	 * sets the destination 
	 * @param destination = the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	} // end of setDestination() method

	/**
	 * returns the double representation of the vacation budget
	 * @return the budget
	 */
	public double getBudget() {
		return budget;
	} // end of getBudget() method

	/**
	 * sets the double representation of the vacation budget
	 * @param budget = the vacation budget to set
	 */
	public void setBudget(double budget) {
		this.budget = budget;
	} // end of setBudget() method
	
	/**
	 * calculates the int representation of how much the vacation is over or 
	 * under the vacation budget
	 * @return the amount the vacation is over (negative number) or under (positive number) budget
	 */
	public int budgetBalance() {
		return Integer.MIN_VALUE;
	} // end budgetBalance() method
	
} // end of Vacation class
