import java.util.Scanner;

public class Assignment2454
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var P = scanner.nextInt();
		var R = scanner.nextInt();
		if(P==0){
			System.out.println("C");
		}else if(R==0){
			System.out.println("B");
		}else{
			System.out.println("A");
		}
	}
}
