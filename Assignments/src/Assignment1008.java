import java.util.Scanner;

public class Assignment1008
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number  = sc.nextInt();
		int salary = sc.nextInt();
		double hours = sc.nextDouble();

		System.out.println("NUMBER = "+ number);
		System.out.printf("SALARY = U$ %.2f", salary*hours);
	}
}
