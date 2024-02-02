import java.util.Scanner;

public class Assignment1028
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var testCases = scanner.nextInt();
		StringBuilder a = new StringBuilder();
		for(int i=0; i< testCases; i++){
			var x = scanner.nextInt();
			var y = scanner.nextInt();
			//gcd(x,y);
			a.append(gcd(x,y) + "\n");
		}
		System.out.print(a.toString());
		scanner.close();
	}



	private static int gcd(int x, int y)
	{
		var min = Math.min(x,y);
		var max = Math.max(x,y);
		if(x == 0){
			return y;
		}
		if(y == 0){
			return x;
		}
		var remainder = max % min;
		return gcd(min, remainder);
	}
}
