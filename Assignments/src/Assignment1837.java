import java.io.IOException;
import java.util.Scanner;

public class Assignment1837
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		var N_2 = scanner.nextInt();

		if(N_1 >= 0){
			var r = N_1 % N_2; // must be positive
			var b = Math.floor(N_1 / N_2);
			System.out.println((int) b + " " + r);
		}else{
			int b = (N_1 - N_2) / N_2;
			System.out.println(b);
			System.out.println((b*N_2) % N_1);
		}

	}
}
