import java.util.Scanner;

public class Assignment1134
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int N_1;
		var alcohol = 0;
		var gas = 0;
		var diesel = 0;
		while ((N_1 = scanner.nextInt()) != 4)
		{
			if (N_1 == 1)
			{
				alcohol += 1;
			}

			if (N_1 == 2)
			{
				gas += 1;
			}

			if(N_1 == 3){
				diesel += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcohol);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+diesel);
	}
}
