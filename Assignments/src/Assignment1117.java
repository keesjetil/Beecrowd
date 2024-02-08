import java.util.Scanner;

public class Assignment1117
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		var count = 0;
		double score = 0.00;
		while(count != 2){
			var x = scanner.nextDouble();
			if(10 < x || x <= 0){
				System.out.println("nota invalida");
			}else{
				count ++;
				score += Math.floor(x*1000)/1000;
			}
		}
		System.out.printf("media = %.2f\n", score / count);
	}
}
