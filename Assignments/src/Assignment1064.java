import java.util.Scanner;

public class Assignment1064
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var i = scanner.nextDouble();
		var j = scanner.nextDouble();
		var k = scanner.nextDouble();
		var l = scanner.nextDouble();
		var m = scanner.nextDouble();
		var n = scanner.nextDouble();

		int positives = 0;
		double totalPos = 0;
		if (i > 0)
		{
			positives += 1;
			totalPos += i;
		}
		if (j > 0)
		{
			positives += 1;
			totalPos += j;
		}
		if (k > 0)
		{
			positives += 1;
			totalPos += k;
		}
		if (l > 0)
		{
			positives += 1;
			totalPos += l;
		}
		if (m > 0)
		{
			positives += 1;
			totalPos += m;
		}
		if (n > 0)
		{
			positives += 1;
			totalPos += n;
		}
		System.out.println(positives + " valores positivos");
		System.out.printf("%.1f\n",totalPos / (double) positives);
	}
}
