import java.util.Scanner;

public class Assignment1142
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		var N_1 = scanner.nextInt();
		for(int i=1; i<=N_1 * 4; i++){
			if(i % 4 == 0){
				System.out.print("PUM\n");
			}else{
				System.out.print(i + " ");
			}
		}
	}
}
