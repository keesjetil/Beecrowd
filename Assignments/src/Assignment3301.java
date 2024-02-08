import java.util.Scanner;

public class Assignment3301
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var H = scanner.nextInt();
		var Z = scanner.nextInt();
		var L = scanner.nextInt();

		var min = Math.min(H, Math.min(Z,L));
		var max = Math.max(H, Math.max(Z,L));

		if(min<H && H<max){
			System.out.println("huguinho");
		}

		if(min<Z && Z<max){
			System.out.println("zezinho");
		}

		if(min<L && L<max){
			System.out.println("luisinho");
		}
	}
}
