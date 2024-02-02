import java.util.Scanner;

public class Assignment1074
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextInt();
		for(var i = 1; i<= N_1; i++){
			var num = scanner.nextInt();
			if(num==0){
				System.out.println("NULL");
			}else if(num%2==0){
				if(num<0){
					System.out.println("EVEN NEGATIVE");
				}else{
					System.out.println("EVEN POSITIVE");
				}
			}
			else if(num%2==1){
				if(num<0){
					System.out.println("ODD NEGATIVE");
				}else{
					System.out.println("ODD POSITIVE");
				}
			}else{
				System.out.println("ODD NEGATIVE");
			}
		}
	}
}
