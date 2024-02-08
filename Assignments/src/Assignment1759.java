import java.util.Scanner;

public class Assignment1759
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N = scanner.nextInt();
		var sb = new StringBuilder();
		for(int i=1; i<= N; i++){
			if(i!= N){
				sb.append("Ho ");
			}else{
				sb.append("Ho!");
			}
		}
		System.out.println(sb);
	}
}
