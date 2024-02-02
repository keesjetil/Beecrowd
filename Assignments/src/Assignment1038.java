import java.util.HashMap;
import java.util.Scanner;

public class Assignment1038
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		var x = leitor.nextInt();
		var y = leitor.nextInt();
		var menu = new HashMap<Integer,Double>();
		menu.put(1,4.00);
		menu.put(2,4.50);
		menu.put(3,5.00);
		menu.put(4,2.00);
		menu.put(5,1.50);
		//System.out.println(menu.get(x));
		System.out.printf("Total: R$ %.2f\n",menu.get(x) *y);

	}
}
