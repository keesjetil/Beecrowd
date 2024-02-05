import java.util.Scanner;

public class Assignment1101
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var n1 = scn.nextInt();
		var n2 = scn.nextInt();
		while (n1 > 0 && n2 > 0)
		{
			var score = 0;
			for (int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++)
			{
				System.out.print(i + " ");
				score += i;
			}
			System.out.println("Sum=" + score);
			n1 = scn.nextInt();
			n2 = scn.nextInt();
		}
	}
}
