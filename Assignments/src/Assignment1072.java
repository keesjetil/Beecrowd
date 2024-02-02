import java.util.Scanner;

public class Assignment1072
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var testCases = scanner.nextInt();
		var inScore = 0;
		var outScore = 0;

		for(var i=0; i<testCases; i++){
			var number = scanner.nextInt();
			if(number <=20 && number >= 10){
				inScore += 1;
			}else{
				outScore += 1;
			}
		}
		System.out.println(inScore + " in");
		System.out.println(outScore + " out");
	}
}
