import java.util.Scanner;

public class Assignment1037
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var point = scanner.nextDouble();

		if (point >= 0 && point <= 25)
		{
			System.out.println("Intervalo [0,25]");
		}

		else if (point > 25 && point <= 50)
		{
			System.out.println("Intervalo (25,50]");
		}

		else if (point > 50 && point <= 75)
		{
			System.out.println("Intervalo (50,75]");
		}

		else if (point > 75 && point <= 100)
		{
			System.out.println("Intervalo (75,100]");
		}
		else
		{
			System.out.println("Fora de intervalo");
		}
	}
}
