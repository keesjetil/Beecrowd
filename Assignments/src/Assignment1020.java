import java.util.Scanner;

public class Assignment1020
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var age = scanner.nextInt();

		var years = Math.floor(age / 365.0);
		var rest = age % 365;
		var months = Math.floor(rest/30.0);
		rest = rest % 30;
		var days = Math.floor(rest/1.0);

		System.out.println((int) years+" ano(s)");
		System.out.println((int) months+" mes(es)");
		System.out.println((int) days+" dia(s)");
	}
}
