import java.util.Scanner;

public class Assignment1035
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var A = scanner.nextInt();
		var B = scanner.nextInt();
		var C = scanner.nextInt();
		var D = scanner.nextInt();

		var firstTest = false;
		if(B > C && D > A){
			firstTest = true;
		}
		var secondTest = false;
		if(C+D > A+B){
			secondTest = true;
		}
		var thirdTest = false;
		if(C > 0 && D > 0 && A % 2 ==0){
			thirdTest = true;
		}

		if(firstTest && secondTest && thirdTest){
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
	}
}
