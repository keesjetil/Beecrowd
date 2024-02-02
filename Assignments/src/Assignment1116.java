import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1116
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var cases = scanner.nextInt();
		var i = 0;
		while(i < cases){
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();

			if(b == 0){
				System.out.println("divisao impossivel");
			}else{
				System.out.println(a/b);
			}
			i++;
		}
	}
}
