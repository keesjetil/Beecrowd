import java.util.Scanner;

public class Assignment1036
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var A = scanner.nextDouble();
		var B = scanner.nextDouble();
		var C = scanner.nextDouble();

		var D = Math.sqrt(Math.pow(B,2) - 4 * A * C);

		if(Double.isNaN(D)){
			System.out.println("Impossivel calcular");
		}else{
			var x_1 = (-B + D) / (2*A);
			var x_2 = (-B - D) / (2*A);

			if(Double.isNaN(x_1) || Double.isNaN(x_2)){
				System.out.println("Impossivel calcular");
			}else{
				System.out.printf("R1 = %.5f\n",x_1);
				System.out.printf("R2 = %.5f\n",x_2);
			}
		}
	}
}
