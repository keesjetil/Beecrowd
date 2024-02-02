import java.util.Scanner;

public class Assignment1078
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		for(var i = 1; i<= 10; i++){
			System.out.println(i+" x "+N_1+" = " +i*N_1);
		}
	}
}
