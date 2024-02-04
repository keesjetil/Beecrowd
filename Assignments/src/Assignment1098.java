public class Assignment1098
{
	public static void main(String[] args)
	{
		double max = 3.0;
		double min = 1.0;
		for (double i = 0.0d; i <= 2.0d; i += 0.20d)
		{
			for (double j = min; j <= max; j += 1.0)
			{
				if (Math.ceil(i) == Math.floor(i))
				{
					System.out.print("I=" + (int) i);
				}
				else
				{
					System.out.printf("I=%.1f", i);
				}

				if ((j + i) % 1 == 0)
				{
					System.out.println(" J=" + (int) (j + i));
				}
				else
				{
					System.out.printf(" J=%.1f\n", (j + i));
				}
			}

		}
	}
}
