import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Assignment1061
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		var D_1 = scanner.nextInt();
		var H_1 = scanner.nextInt();
		scanner.next();
		var M_1 = scanner.nextInt();
		scanner.next();
		var S_1 = scanner.nextInt();

		scanner.next();
		var D_2 = scanner.nextInt();
		var H_2 = scanner.nextInt();
		scanner.next();
		var M_2 = scanner.nextInt();
		scanner.next();
		var S_2 = scanner.nextInt();

		Date date1 = new Date(2023, 4, D_1, H_1, M_1, S_1);
		Date date2 = new Date(2023, 4, D_2, H_2, M_2, S_2);


		long diffInSeconds = (date2.getTime() - date1.getTime()) / 1000 ;

		int day = (int) TimeUnit.SECONDS.toDays(diffInSeconds);
		System.out.println(day + " dia(s)");

		int hours = (int) TimeUnit.SECONDS.toHours(diffInSeconds) - (int) TimeUnit.DAYS.toHours(day);
		System.out.println(hours  + " hora(s)");
		int minutes = (int) TimeUnit.SECONDS.toMinutes(diffInSeconds) - (int) TimeUnit.DAYS.toMinutes(day) - (int) TimeUnit.HOURS.toMinutes(hours);
		System.out.println(minutes + " minuto(s)");
		int seconds = (int) diffInSeconds % 60;
		System.out.println(seconds + " segundo(s)");
//		System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
	}
}
