import java.util.Scanner;

public class Assignment3476
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		var a = 100.00/(double)S;
		var b= 100.00/(double)B;
		var c = 100.00/(double)C;
		System.out.printf("%.3f\n",100/(a + b + c));
	}
}
