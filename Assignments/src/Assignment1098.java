public class Assignment1098
{
	public static void main(String[] args)
	{
		double max = 3.0;
		double min = 1.0;
		for (double i = 0.0; i <= 2.0; i += 0.2d)
		{
			for (double j = min; j <= max; j += 1.0)
			{
				if (Math.ceil(i) == Math.floor(i))
				{
					System.out.print("I=" + (int) i);
				}
				else
				{
					if(Math.round(i * 100.0) / 100.0 == 2.0){
						System.out.print("I=2");
					}else{
						System.out.printf("I=%.1f", i);
					}
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
