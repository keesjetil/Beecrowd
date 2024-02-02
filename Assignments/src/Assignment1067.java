import java.util.Scanner;

public class Assignment1067
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var i = scanner.nextDouble();
		for (var j = 1; j < i; j++)
		{
			if(j%2 ==1){
				System.out.println(j);
			}
		}
	}
}
