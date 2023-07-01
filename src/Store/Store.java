package Store;
import java.util.ArrayList;

/**
 * A class that holds customer data for a store.
 */
public class Store
{
		private ArrayList<Customer> customerList = new ArrayList<Customer>();
		private ArrayList<String> nameOfBestCustomers = new ArrayList<String>();
		private Customer bestCustomer;
		
		/**
		 * Adds a customer to the store's customer list.
		 * @param cust Customer to be saved on store's list.
		 */
		public void addCustomer(Customer cust)
		{
			this.customerList.add(cust);
		}
		
		/**
		 * Adds sales data to the store's customer list for given customer and given amount.
		 * @param customerName Name of customer.
		 * @param amount Amount spent.
		 */
		public void addSale(String customerName, double amount)
		{
			for(int i = 0; i<this.customerList.size(); i++)
			{
				if(this.customerList.get(i).getName().toUpperCase().equals(customerName.toUpperCase()))
				{
					this.customerList.get(i).addSpentTotal(amount);
					break;
				}
			}
		}
		
		/**
		 * Finds the highest spending customer on the store's customer list.
		 * @return Name of highest spending customer.
		 */
		public String nameOfBestCustomer()
		{
			this.bestCustomer = this.customerList.get(0);
			for(int i = 1; i<this.customerList.size(); i++)
			{
				if(this.customerList.get(i).getTotalSpent() > this.bestCustomer.totalSpent)
				{
					this.bestCustomer = this.customerList.get(i);
				}
			}
			return this.bestCustomer.getName();
		}
		
		/**
		 * Finds n number of highest spending customer(s) on the store's customer list.
		 * @param topN Number of customers.
		 * @return A list of the highest paying customers.
		 */
		public ArrayList<String> nameOfBestCustomers(int topN)
		{
			ArrayList<Customer> myCustomerList = new ArrayList<Customer>(this.customerList);
			Customer myBestCustomer;
			if(topN>myCustomerList.size()) topN=myCustomerList.size();
			for(int i=0; i<topN; i++)
			{
				int indexToRemove = 0;
				myBestCustomer = myCustomerList.get(0);
				for(int j=0; j<myCustomerList.size(); j++)
				{
					if(myCustomerList.get(j).getTotalSpent() > myBestCustomer.getTotalSpent())
					{
						myBestCustomer = myCustomerList.get(j);
						indexToRemove = j;
					}
				}
				myCustomerList.remove(indexToRemove);
				this.nameOfBestCustomers.add(myBestCustomer.getName());
			}
			return this.nameOfBestCustomers;
		}

}
