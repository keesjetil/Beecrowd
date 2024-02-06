import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1151
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var N = scn.nextInt();
		List<Integer> seq = fibonacci(N);
		for(int i=0; i<seq.size(); i++){
			if(i != seq.size() -1){
				System.out.print(seq.get(i) + " ");
			}else{
				System.out.print(seq.get(i)+ "\n");
			}
		}
	}


	private static List<Integer> fibonacci(int N)
	{
		List<Integer> sequence = new ArrayList<>();
		if (N == 0)
		{
			sequence.add(0);
			return sequence;
		}
		if(N==1){
			sequence.add(0);
			sequence.add(1);
			return sequence;
		}
		for (int i = 0; i < N; i++)
		{
			if (i == 0)
			{
				sequence.add(0);
			}
			else if (i == 1)
			{
				sequence.add(1);
			}
			else
			{
				int prev1 = sequence.get(i-2);
				int prev2 = sequence.get(i - 1);
				int newEntry = prev1 + prev2;
				sequence.add(newEntry);
			}
		}

		return sequence;
	}
}
