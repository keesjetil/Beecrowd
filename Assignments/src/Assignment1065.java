import java.util.Scanner;

public class Assignment1065
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var i = scanner.nextInt();
		var score = 0;
		while(scanner.hasNextInt()){
			System.out.println(i);
			if(i%2==0){
				score += 1;
			}
			i = scanner.nextInt();
		}
		scanner.close();

		System.out.println(score + " valores pares");
	}
}
