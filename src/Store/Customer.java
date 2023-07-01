package Store;
/**
 * A customer with name and amount of money spent.
 */
public class Customer
{
	String name;
	double totalSpent;
	
	/**
	 * Constructs a customer object with given name and amount spent.
	 * @param name Name of customer.
	 * @param totalSpent Amount of money spent.
	 */
	public Customer(String name, double totalSpent)
	{
		this.name = name;
		this.totalSpent = totalSpent;
	}
	
	/**
	 * Adds the given amount to the customers total amount spent.
	 * @param amount Amount of money spent.
	 */
	public void addSpentTotal(double amount)
	{
		this.totalSpent += amount;
	}
	
	/**
	 * Finds the total amount of money spent.
	 * @return Total amount of money spent.
	 */
	public double getTotalSpent()
	{
		return this.totalSpent;
	}
	
	/**
	 * Finds the customers name.
	 * @return The customers name.
	 */
	public String getName()
	{
		return this.name;
	}
}
