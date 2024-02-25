import java.util.Scanner;

public class Assignment1177
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		var T = sc.nextInt();
		for(int i =0; i<1000; i++){
			System.out.printf("N[%d] = %d%n", i , i%T);
		}
	}
}
