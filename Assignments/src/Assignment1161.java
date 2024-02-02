import java.util.Scanner;

public class Assignment1161
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			long x = sc.nextInt();
			long y = sc.nextInt();
//			System.out.println(x);
//			System.out.println(y);
			System.out.println(factorial(x) + factorial(y));
//			System.out.println("----");
		}
	}

	private static long factorial(long n){
		if(n == 0) {
			return 1;
		}else{
			return n * factorial(n-1);
		}
	}
}
