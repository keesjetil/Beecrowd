import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment1031
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N = scanner.nextInt();
		var strList = new ArrayList<Integer>();
		while (N != 0)
		{
			List<Integer> intArray = new ArrayList<>();
			for (int i = 1; i < N + 1; i++)
			{
				intArray.add(i);
			}
			var score = 0;
			var m = 0;
			while (score != 13)
			{
				m += 1;
				var arr = new ArrayList<>(intArray);
				score = simulate(m, arr, 0);
			}
			strList.add(m);
			N = scanner.nextInt();
		}

		for (var item : strList)
		{
			System.out.println(item);
		}
	}


	private static int simulate(int m, List<Integer> intArray, int index)
	{
		if (intArray.size() == 1)
		{
			return intArray.get(0);
		}
		var currentEl = intArray.get(index);
		var nextInit = intArray.get((index + 1) % intArray.size());

		intArray.remove(currentEl);
		var initIndex = intArray.indexOf(nextInit);
		var nextEl = intArray.get((initIndex + m - 1) % intArray.size());
		return simulate(m, intArray, intArray.indexOf(nextEl));
	}
}
