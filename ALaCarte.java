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
File Name: ALaCarte.java
*/

public class ALaCarte extends Vacation {
	private String hotelName = "";
	private double roomCost = 0.0;
	private String airline = "";
	private double airfare = 0.0;
	private double meals = 0.0;

	/**
	 * default constructor for ALaCarte class
	 */
	public ALaCarte() {
		super();
		this.hotelName = "";
		this.roomCost = 0.0;
		this.airline = "";
		this.airfare = 0.0;
		this.meals = 0.0;
	} // end of default constructor for the ALaCarte class

	/**
	 * parameterized constructor for ALaCarte class
	 * @param destination = vacation destination
	 * @param budget = vacation budget
	 * @param hotelName = name of the hotel
	 * @param roomCost = cost of the hotel room
	 * @param airline = airline to and from vacation
	 * @param airfare = price of airline tickets to and from vacation
	 * @param meals = estimated cost for meals on vacation
	 */
	public ALaCarte(String destination, double budget, String hotelName, double roomCost, String airline, double airfare, double meals) {
		super(destination, budget);
		this.hotelName = hotelName;
		this.roomCost = roomCost;
		this.airline = airline;
		this.airfare = airfare;
		this.meals = meals;
	} // end of parameterized constructor for the ALaCarte class

	/**
	 * returns the hotels name
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	} // end of getHotel() method

	/**
	 * sets the hotels name
	 * @param hotelName = the hotels name to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	} // end of setHotelName() method

	/**
	 * returns the cost of the room
	 * @return the roomCost
	 */
	public double getRoomCost() {
		return roomCost;
	} // end of getRoomCost() method

	/**
	 * sets the cost of the room
	 * @param roomCost = the cost of the room to set
	 */
	public void setRoomCost(double roomCost) {
		this.roomCost = roomCost;
	} // end of setRoom() method

	/**
	 * returns the airline used for the vacation travel
	 * @return the airline
	 */
	public String getAirline() {
		return airline;
	} // end of getAirline() method

	/**
	 * sets the airline to use for vacation travel
	 * @param airline = the airline to set
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	} // end of setAirline() method

	/**
	 * returns the airfare costs for travel to the vacation destination and back
	 * @return the airfare
	 */
	public double getAirfare() {
		return airfare;
	} // end of getAirfare() method

	/**
	 * sets the airfare to get to the vacation destination and back
	 * @param airfare = the airfare to set
	 */
	public void setAirfare(double airfare) {
		this.airfare = airfare;
	} // end of setAirfare() method

	/**
	 * returns the estimated meal costs
	 * @return the meals cost
	 */
	public double getMeals() {
		return meals;
	} // end of getMeals() method

	/**
	 * sets the estimated meal costs for the vacation
	 * @param meals = the estimated meals cost to set
	 */
	public void setMeals(double meals) {
		this.meals = meals;
	} // end of setMeals() method

	/* (non-Javadoc)
	 * @see Vacation#budgetBalance()
	 */
	@Override
	public int budgetBalance() {
		double estimatedCosts = (this.getRoomCost() + this.getAirfare() + this.getMeals());
		int bugetBalance = (int) (super.getBudget() - estimatedCosts);
		return bugetBalance;
	}  // end of budgetBalance() method

} // end of ALaCarte class
