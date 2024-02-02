import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2172
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		var X = sc.nextInt();
		var M = sc.nextInt();
		var listOfArrays = new ArrayList<Integer>();
		while (X != 0 && M != 0)
		{
			if (X != 0 && M != 0)
			{
				listOfArrays.add(X * M);
			}
			X = sc.nextInt();
			M = sc.nextInt();

		}
		for (var element : listOfArrays)
		{
			System.out.println(element);
		}
	}
}

