import java.util.Scanner;

public class Assignment1094
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var testCases = scanner.nextInt();
		var C = 0;
		var R = 0;
		var S = 0;
		var total = 0;
		for (int i = 0; i < testCases; i++)
		{
			int amount = scanner.nextInt();
			total += amount;
			String type = scanner.next();
			switch (type)
			{
				case "C":
					C += amount;
					break;
				case "R":
					R += amount;
					break;
				case "S":
					S += amount;
					break;
			}
		}
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + C);
		System.out.println("Total de ratos: " + R);
		System.out.println("Total de sapos: " + S);
		System.out.printf("Percentual de coelhos: %.2f %%\n", ((double) C / (double) total) * 100);
		System.out.printf("Percentual de ratos: %.2f %%\n", ((double) R / (double) total) * 100);
		System.out.printf("Percentual de sapos: %.2f %%\n", ((double) S / (double) total) * 100);
	}
}
