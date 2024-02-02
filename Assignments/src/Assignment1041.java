import java.util.Scanner;

public class Assignment1041
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var x = scanner.nextDouble();
		var y = scanner.nextDouble();
		if (x == 0 && y != 0)
		{
			System.out.println("Eixo Y");
		}
		if (x != 0 && y == 0)
		{
			System.out.println("Eixo X");
		}
		if (x == 0 && y == 0)
		{
			System.out.println("Origem");
		}

		if (x > 0 && y > 0)
		{
			System.out.println("Q1");
		}
		if (x < 0 && y > 0)
		{
			System.out.println("Q2");
		}
		if (x < 0 && y < 0)
		{
			System.out.println("Q3");
		}
		if (x > 0 && y < 0)
		{
			System.out.println("Q4");
		}
	}
}
