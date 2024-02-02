import java.util.Scanner;

public class Assignment1002
{
	public static void main(String[] args)
	{
		double n = 3.14159;
		Scanner sc=new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.printf("A=%.4f\n", (n*Math.pow(a,2)));
	}
}
