import java.util.Scanner;

public class Assignment1071
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		var N_2 = scanner.nextInt();
		var score= 0;
		for(var i = Math.min(N_1,N_2)+1;i<Math.max(N_1,N_2); i++){
			if(i%2!=0){
				score +=i;
			}
		}
		System.out.println(score);
	}
}
