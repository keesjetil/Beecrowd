import java.util.Scanner;

public class Assignment1132
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		var N_1 = scanner.nextInt();
		var N_2 = scanner.nextInt();

		var min = Math.min(N_1,N_2);
		var max = Math.max(N_1,N_2);
		var score = 0;
		for(int i= min; i<= max; i++){
			if(i%13 != 0){
				score +=i;
			}
		}
		System.out.println(score);
	}
}
