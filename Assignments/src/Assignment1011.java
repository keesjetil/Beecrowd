import java.io.IOException;
import java.util.Scanner;

public class Assignment1011
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var r = scanner.nextInt();
		System.out.printf("VOLUME = %.3f\n",volume(r));

	}


	private static double volume(int r)
	{
		return (4/3.0) * 3.14159 * Math.pow(r,3);
	}
}
