import java.util.Scanner;

public class Assignment1153
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var N = scn.nextInt();
		System.out.println(factorial(N));

	}


	private static int factorial(int n)
	{
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
}
