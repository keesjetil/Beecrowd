import java.util.Scanner;

public class Assignment1114
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var n1 = scn.nextInt();
		while (n1 != 2002)
		{
			System.out.println("Senha Invlaida");
			n1 = scn.nextInt();
		}
		System.out.println("Aceso Permitido");
	}
}
