import java.util.Arrays;
import java.util.Scanner;

public class Assignment2721
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (var i = 0; i < 9; i++)
		{
			sum += sc.nextInt();
		}
		var result = sum % 9;
		switch (result)
		{
			case 0 ->
			{
				System.out.println("Rudolph");
			}
			case 1 ->
			{
				System.out.println("Dasher");
			}
			case 2 ->
			{
				System.out.println("Dancer");
			}
			case 3 ->
			{
				System.out.println("Prancer");
			}
			case 4 ->
			{
				System.out.println("Vixen"); break;
			}
			case 5 ->
			{
				System.out.println("Comet");
			}
			case 6 ->
			{
				System.out.println("Cupid");
			}
			case 7 ->
			{
				System.out.println("Donner");
			}
			case 8 ->
			{
				System.out.println("Blitzen");
			}
		}

	}
}
