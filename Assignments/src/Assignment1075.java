import java.util.Scanner;

public class Assignment1075
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		for(var i = 1; i< 10000; i++){
			if(i%N_1==2){
				System.out.println(i);
			}
		}
	}
}
