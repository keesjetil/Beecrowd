import java.io.IOException;
import java.util.Scanner;

public class Assignment1021
{
	public static void main(String[] args) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		var input = scanner.nextDouble();

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

		System.out.println("NOTAS:");
		System.out.println((int) hundreds + " nota(s) de R$ 100.00");
		System.out.println((int) fifties + " nota(s) de R$ 50.00");
		System.out.println((int) twenties + " nota(s) de R$ 20.00");
		System.out.println((int) tens + " nota(s) de R$ 10.00");
		System.out.println((int) fives + " nota(s) de R$ 5.00");
		System.out.println((int) twos + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println((int) ones + " moeda(s) de R$ 1.00");

		var digits = (input - Math.floor(input))* 100;
		fifties = Math.floor(digits / 50);
		rest = digits % 50;
		twenties = Math.floor(rest / 25);
		rest = rest % 25;
		tens = Math.floor(rest/10.0);
		rest = rest%10;
		fives = Math.floor(rest/5.0);
		rest = rest%5;

		System.out.println((int) fifties + " moeda(s) de R$ 0.50");
		System.out.println((int) twenties + " moeda(s) de R$ 0.25");
		System.out.println((int) tens + " moeda(s) de R$ 0.10");
		System.out.println((int) fives + " moeda(s) de R$ 0.05");
		System.out.println((int) rest + " moeda(s) de R$ 0.01");
	}
}
