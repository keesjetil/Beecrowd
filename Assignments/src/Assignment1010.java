import java.util.Scanner;

public class Assignment1010
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		var total = 0.00;

		int productCode  = sc.nextInt();
		int amount  = sc.nextInt();
		double price  = sc.nextDouble();

		int productCode1  = sc.nextInt();
		int amount1  = sc.nextInt();
		double price1  = sc.nextDouble();
		total += amount * price;
		total+= amount1 * price1;


		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
	}
}
