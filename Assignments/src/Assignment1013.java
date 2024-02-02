import java.io.IOException;
import java.util.Scanner;

public class Assignment1013
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var A = scanner.nextInt();
		var B = scanner.nextInt();
		var C = scanner.nextInt();

		var greatest = A;
		if(greatest < B){
			greatest = B;
		}
		if(greatest < C){
			greatest = C;
		}

		System.out.println(greatest + " eh o maior");
	}
}
