import java.util.Scanner;

public class Assignment1019
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var t = scanner.nextInt();

		var seconds = t % 60;
		var minutes = (t/60) % 60;
		var hours = (t / 60 / 60) % 60;
		System.out.println(hours+":"+minutes+":"+seconds);
	}
}
