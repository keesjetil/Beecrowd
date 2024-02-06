import java.util.Scanner;


public class Assignment1146
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int N;
		while((N = scanner.nextInt()) != 0){
			for(int i =1; i<=N; i++){
				if(i!=N){
					System.out.print(i + " ");
				}else{
					System.out.println(i);
				}
			}
		}
	}
}
