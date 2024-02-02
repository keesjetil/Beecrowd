import java.util.Scanner;

public class Assignment1060
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var score = 0;
		for(var i=0; i<6; i++){
			var x = scanner.nextDouble();
			if(x > 0){
				score += 1;
			}
		}
		scanner.close();
		System.out.println(score + " valores positivos");
	}
}
