import java.util.Scanner;

public class Assignment1165
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		var N = sc.nextInt();
		for (var i = 0; i < N; i++)
		{
			var primeToCheck = sc.nextInt();
			var isPrime = true;
			for(var j =2; j<=primeToCheck/2; j++){
				if(primeToCheck%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(primeToCheck+" eh primo");
			}else{
				System.out.println(primeToCheck+" nao eh primo");
			}
		}
	}
}
