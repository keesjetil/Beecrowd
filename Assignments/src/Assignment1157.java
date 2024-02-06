import java.util.Scanner;

public class Assignment1157
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var N = scn.nextInt();
		for(int j =1; j<= N; j++){
			if(Math.ceil(N / (double) j) == N / j){
				System.out.println(j);
			}
		}

	}
}
