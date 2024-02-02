import java.io.IOException;
import java.util.Scanner;

public class Assignment1018
{
		public static void main(String[] args) throws IOException
		{
			Scanner scanner = new Scanner(System.in);
			var input = scanner.nextInt();

			var hundreds = Math.floor(input / 100.00);
			var rest = input % 100;
			var fifties = Math.floor(rest/50.0);
			rest = rest % 50;
			var twenties = Math.floor(rest/20.0);
			rest = rest%20;
			var tens = Math.floor(rest/10.0);
			rest = rest%10;
			var fives = Math.floor(rest/5.0);
			rest = rest%5;
			var twos = Math.floor(rest/2.0);
			rest = rest%2;
			var ones = Math.floor(rest/1.0);

			System.out.println(input);
			System.out.println((int) hundreds + " nota(s) de R$ 100,00");
			System.out.println((int) fifties + " nota(s) de R$ 50,00");
			System.out.println((int) twenties + " nota(s) de R$ 20,00");
			System.out.println((int) tens + " nota(s) de R$ 10,00");
			System.out.println((int) fives + " nota(s) de R$ 5,00");
			System.out.println((int) twos + " nota(s) de R$ 2,00");
			System.out.println((int) ones + " nota(s) de R$ 1,00");
		}
}
