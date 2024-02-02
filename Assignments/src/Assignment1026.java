import java.util.Scanner;

public class Assignment1026
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			long u = leitor.nextLong();
			long m = leitor.nextLong();
			System.out.println(u ^ m);
		}
	}
}
