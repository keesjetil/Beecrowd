import java.util.Date;
import java.util.Scanner;

public class Assignment1047
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var H_1 = scanner.nextInt();
		var M_1 = scanner.nextInt();

		var H_2 = scanner.nextInt();
		var M_2 = scanner.nextInt();

		Date date1 = new Date(2023, 1, 1, H_1, M_1);
		Date date2 = new Date(2023, 1, 2, H_2, M_2);

		if (H_2 > H_1 || (H_2 == H_1 && M_2 > M_1))
		{
			date2 = new Date(2023, 1, 1, H_2, M_2);
		}

		long diffInMinutes = (date2.getTime() - date1.getTime()) / 1000 / 60;

		long minutes = diffInMinutes % 60;
		long hours = (diffInMinutes - minutes) / 60;

		System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
	}
}
