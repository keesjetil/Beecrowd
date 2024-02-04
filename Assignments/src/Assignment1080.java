import java.util.Scanner;

public class Assignment1080
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		var highestPos = 0;
		var highestScore = 0;
		for(int j=1; j<=100; j++){
			var value = scanner.nextInt();
			if(value > highestScore){
				highestScore = value;
				highestPos = j;
			}
		}
		System.out.println(highestScore);
		System.out.println(highestPos);
	}
}
