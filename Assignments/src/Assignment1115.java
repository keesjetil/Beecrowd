import java.util.Scanner;

public class Assignment1115
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var X = scanner.nextInt();
		var Y = scanner.nextInt();

		while(X!= 0 && Y != 0){
			if(X>0 && Y> 0){
				System.out.println("primeiro");
			} else if(X > 0 && Y < 0){
				System.out.println("quarto");
			}else if(X < 0 && Y < 0){
				System.out.println("terceiro");
			}else{
				System.out.println("segundo");
			}
			X = scanner.nextInt();
			Y = scanner.nextInt();
		}
	}
}
