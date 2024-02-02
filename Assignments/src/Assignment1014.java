import java.io.IOException;
import java.util.Scanner;

public class Assignment1014
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var A = scanner.nextDouble();
		var B = scanner.nextDouble();

		System.out.printf("%.3f km/l\n", A/B);
	}
}
