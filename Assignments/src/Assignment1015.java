import java.io.IOException;
import java.util.Scanner;

public class Assignment1015
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var x1 = scanner.nextDouble();
		var y1 = scanner.nextDouble();

		var x2 = scanner.nextDouble();
		var y2 = scanner.nextDouble();

		var sumOfSquares = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
		System.out.printf("%.4f\n",Math.sqrt(sumOfSquares));
	}
}
