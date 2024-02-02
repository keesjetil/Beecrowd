import java.util.HashMap;
import java.util.Scanner;

public class Assignment1087
{
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		var scan = true;
		while (scan)
		{
			var X_1 = scanner.nextInt();
			var Y_1 = scanner.nextInt();
			var X_2 = scanner.nextInt();
			var Y_2 = scanner.nextInt();
			if (X_1 == 0 && X_2 == 0 && Y_1 == 0 && Y_2 == 0)
			{
				scan = false;
			}
			else
			{
				var score = 2;
				if (X_1 == X_2 && Y_1 == Y_2)
				{
					score = 0;
					System.out.println(score);
				}
				else
				{
					var b_pos = Y_1 - X_1;
					var b_neg = Y_1 + X_1;
					score = checkDiagonalLines(X_1, Y_1, X_2, Y_2, b_pos, b_neg);
					System.out.println(score);
				}
			}
		}
	}


	private static int checkDiagonalLines(int X_1, int Y_1, int X_2, int Y_2, int b_pos, int b_neg)
	{
		var onSameXAxis = X_1 == X_2;
		var onSameYAxis = Y_1 == Y_2;
		var onPositiveDiagonal = Y_2 == X_2 + b_pos;
		// Negative klopt niet
		var onNegativeDiagonal = Y_2 == -X_2 + b_neg;
		if (onSameXAxis || onSameYAxis || onPositiveDiagonal || onNegativeDiagonal)
		{
			return 1;
		}
		return 2;
	}
}
