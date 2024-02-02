import java.util.HashMap;
import java.util.Scanner;

public class Assignment1985
{
	public static void main(String[] args)
	{
		var menu = new HashMap<Integer, Double>();
		menu.put(1001, 1.50);
		menu.put(1002, 2.50);
		menu.put(1003, 3.50);
		menu.put(1004, 4.50);
		menu.put(1005, 5.50);
		var totalPrice = 0.00;

		Scanner scn = new Scanner(System.in);
		var amountOfOrders = scn.nextInt();
		for(int i=0; i<amountOfOrders; i++){
			var menuItem = scn.nextInt();
			var amount = scn.nextInt();

			totalPrice += menu.get(menuItem)*amount;
		}
		System.out.printf("%.2f\n",totalPrice);
	}
}
