import java.util.Scanner;

public class Assignment1046
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		var N_2 = scanner.nextInt();

		if(N_2 <= N_1){
			N_2 += 24;
		}

		System.out.println("O JOGO DUROU " + (N_2 - N_1) + " HORA(S)");
	}
}
