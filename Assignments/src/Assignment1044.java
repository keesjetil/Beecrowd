import java.util.Scanner;

public class Assignment1044
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		var N_2 = scanner.nextInt();

		if(N_2 % N_1 == 0 || N_1 % N_2 == 0 ){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
	}
}
