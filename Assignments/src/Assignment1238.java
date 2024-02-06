import java.util.Scanner;

public class Assignment1238
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N_1 = sc.nextInt();
		for (int i = 0; i < N_1; i++)
		{
			char[] S1 = sc.next().toCharArray();
			char[] S2 = sc.next().toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < Math.max(S1.length, S2.length); j++)
			{
				try
				{
					sb.append(S1[j]);
				}
				catch (Exception e)
				{
					//continue
				}
				try
				{
					sb.append(S2[j]);
				}
				catch (Exception e)
				{
					//continue
				}
			}
			System.out.println(sb.toString());
		}

	}
}
