import java.util.Scanner;

public class Assignment1143
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N = scanner.nextInt();
		for (var i = 1; i <= N; i++)
		{
			int a = (int) Math.pow(i,1);
			int b = (int) Math.pow(i,2);
			int c = (int) Math.pow(i,3);
			System.out.println(a +" " + b +" "+ c);
		}
	}
}
