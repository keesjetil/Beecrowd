import java.util.Scanner;

public class Assignment1016
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var one = scanner.nextInt();
		var two = scanner.nextInt();
		var three = scanner.nextInt();
		var four = scanner.nextInt();
		var score = 0;

		if(one == 1){
			score= 1;
		}
		if(two == 1){
			score= 2;
		}
		if(three == 1){
			score= 3;
		}
		if(four == 1){
			score= 4;
		}

		System.out.println(score);
	}
}
