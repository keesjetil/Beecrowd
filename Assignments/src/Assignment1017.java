import java.io.IOException;
import java.util.Scanner;

public class Assignment1017
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var hours = scanner.nextDouble();
		var km_h = scanner.nextDouble();

		var totalKms = hours * km_h;

		System.out.printf("%.3f\n",totalKms/12);
	}
}
