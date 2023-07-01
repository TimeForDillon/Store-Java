package Store;
import java.util.Scanner;

/**
 * A class to test the Store class.
 */
public class StoreTester
{
	public static void main(String[] args)
	{
		Store myStore = new Store();
		Customer c1 = new Customer("DILLON", 0.0);
		Customer c2 = new Customer("ANDREA", 0.0);
		Customer c3 = new Customer("GABE", 0.0);
		Customer c4 = new Customer("ASA", 0.0);
		myStore.addCustomer(c1);
		myStore.addCustomer(c2);
		myStore.addCustomer(c3);
		myStore.addCustomer(c4);
		
		Scanner in = new Scanner(System.in);
		double input;
		String nameInput;
		
		do
		{
			System.out.print("Please enter customer name: ");
			nameInput = in.next();
			System.out.print("Enter amount spent: ");
			input = in.nextDouble();
			myStore.addSale(nameInput.toUpperCase(), input);
		}while(input != 0);
		System.out.print("How many top customers to print: ");
		int num = in.nextInt();
		System.out.printf("The top %d customers are: ", num);
		System.out.println(myStore.nameOfBestCustomers(num));
		in.close();
	}
}

/*
 *  Output: Please enter customer name: Dillon
			Enter amount spent: 200
			Please enter customer name: Asa
			Enter amount spent: 4999
			Please enter customer name: Andrea
			Enter amount spent: 1000
			Please enter customer name: Dillon
			Enter amount spent: 0
			How many top customers to print: 2
			The top 2 customers are: [ASA, ANDREA]
			
  Expected: Please enter customer name: Dillon
			Enter amount spent: 200
			Please enter customer name: Asa
			Enter amount spent: 4999
			Please enter customer name: Andrea
			Enter amount spent: 1000
			Please enter customer name: Dillon
			Enter amount spent: 0
			How many top customers to print: 2
			The top 2 customers are: [ASA, ANDREA]
 */
