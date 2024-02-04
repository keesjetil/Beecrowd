import java.util.Scanner;

public class Assignment1079
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		for(var i = 1; i<= N_1; i++){
			var a = scanner.nextDouble();
			var b = scanner.nextDouble();
			var c = scanner.nextDouble();

			double avg = (2*a + 3*b + 5*c) / 10.0;
			System.out.printf("%.1f\n",avg);
		}
	}
}
