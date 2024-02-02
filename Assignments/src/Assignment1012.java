import java.io.IOException;
import java.util.Scanner;

public class Assignment1012
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var A = scanner.nextDouble();
		var B = scanner.nextDouble();
		var C = scanner.nextDouble();

		var triangle = 0.5 * A * C;
		var circle = 3.14159 * Math.pow(C,2);
		var trapezium = 0.5*(A+B)*C;
		var square = Math.pow(B,2);
		var rectangle = A*B;

		System.out.printf("TRIANGULO: %.3f\n", triangle);
		System.out.printf("CIRCULO: %.3f\n", circle);
		System.out.printf("TRAPEZIO: %.3f\n", trapezium);
		System.out.printf("QUADRADO: %.3f\n", square);
		System.out.printf("RETANGULO: %.3f\n", rectangle);


	}
}
