import java.util.Scanner;

public class Assignment1130
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N = scanner.nextInt();
		var gameState = scanner.next();


		System.out.println(N);
		System.out.println(gameState);
		while(N != 0){
			N = scanner.nextInt();
			gameState = scanner.next();
		}
	}
}
