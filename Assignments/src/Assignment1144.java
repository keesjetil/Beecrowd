import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1144
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var N = scn.nextInt();
		logicalSequence(N);

	}


	private static void logicalSequence(int n)
	{
		for (int i = 1; i < n + 1; i++)
		{
			var firstSequence = new ArrayList<Integer>(3);
			firstSequence.add(i);
			firstSequence.add((int) Math.pow(i, 2));
			firstSequence.add((int) Math.pow(i, 3));
			System.out.println(firstSequence.get(0) + " " + firstSequence.get(1) + " " + firstSequence.get(2));

			var secondSequence = new ArrayList<Integer>(3);
			secondSequence.add(0);
			secondSequence.add(1);
			secondSequence.add(1);

			var finalList = sumOfTwoArrays(firstSequence, secondSequence);
			System.out.println(finalList.get(0) + " " + finalList.get(1) + " " + finalList.get(2));
		}
	}


	private static List<Integer> sumOfTwoArrays(List<Integer> arr1, List<Integer> arr2)
	{
		var arr3 = new ArrayList<Integer>(arr1.size());
		for (int i = 0; i < arr1.size(); i++)
		{
			arr3.add(arr1.get(i) + arr2.get(i));
		}
		return arr3;
	}
}
