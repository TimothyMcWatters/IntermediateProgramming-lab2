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
File Name: AllInclusive.java
*/

public class AllInclusive extends Vacation {
	private String brand = "";
	private int rating = 0;
	private double price = 0.0;
	
	/**
	 * default constructor for AllInclusive class
	 */
	public AllInclusive() {
		super();
		this.brand = "";
		this.rating = 0;
		this.price = 0.0;
	} // end of default AllInclusive() constructor

	/**
	 * parameterized constructor for AllInclusive class
	 * @param destination = vacation destination
	 * @param budget = vacation budget
	 * @param brand = brand name of the resort
	 * @param rating = rating of the resort
	 * @param price = price of the package
	 */
	public AllInclusive(String destination, double budget, String brand, int rating, double price) {
		super(destination, budget);
		this.brand = brand;
		this.rating = rating;
		this.price = price;
	} // end of parameterized AllInclusive() constructor

	/**
	 * returns the String representation of the resorts brand name
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	} // end of getBrand() method

	/**
	 * sets the resorts brand name
	 * @param brand = the resorts brand name to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	} // end of setBrand() method

	/**
	 * return the rating earned by the resort 
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	} // end of getRating() method

	/**
	 * sets the rating earned by the resort
	 * @param rating = the resorts rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	} // end of setRating() method

	/**
	 * returns the price of the vacation chosen
	 * @return the price
	 */
	public double getPrice() {
		return price;
	} // end of getPrice() method

	/**
	 * sets the price for the vacation chosen
	 * @param price = the vacation price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	} // end of setPrice() method

	/* (non-Javadoc)
	 * @see Vacation#budgetBalance()
	 */
	@Override
	public int budgetBalance() {
		int bugetBalance = (int) (super.getBudget() - this.getPrice());
		return bugetBalance;
	}  // end of budgetBalance() method

} // end of AllInclusive class
