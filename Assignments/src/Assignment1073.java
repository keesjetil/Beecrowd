import java.util.Scanner;

public class Assignment1073
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		for(var i = 1; i<= N_1; i++){
			if(i%2==0){
				System.out.println(i+"^2 = " + (int) Math.pow(i,2));
			}
		}
	}
}
