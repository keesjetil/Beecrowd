import java.util.Scanner;

public class Assignment1009
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name = sc.next();
		double salary  = sc.nextDouble();
		double itemSold = sc.nextDouble();
		var total = salary + (itemSold * 0.15);

		System.out.printf("TOTAL = R$ %.2f\n", total);
	}
}
