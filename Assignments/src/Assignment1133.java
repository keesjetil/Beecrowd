import java.util.Scanner;

public class Assignment1133
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var X = scanner.nextInt();
		var Y = scanner.nextInt();
		for(int i = Math.min(X,Y) +1; i< Math.max(X,Y); i++){
			if(i%5 == 2 || i%5 == 3){
				System.out.println(i);
			}
		}
	}
}
