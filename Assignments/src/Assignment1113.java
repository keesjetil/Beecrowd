import java.util.Scanner;

public class Assignment1113
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var n1 = scn.nextInt();
		var n2 = scn.nextInt();
		while (n1 != n2)
		{
			if(n1>n2){
				System.out.println("Decrescente");
			}else{
				System.out.println("Crescente");
			}
			n1 = scn.nextInt();
			n2 = scn.nextInt();
		}
	}
}
