import java.util.Scanner;

public class Assignment2591
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N = scanner.nextInt();
		var i=0;
		while(i<N){
			String pronounciation = scanner.next();
			String firstPart = pronounciation.substring(0, pronounciation.indexOf("me"));
			String secondPart = pronounciation.substring(pronounciation.indexOf("me"));
			System.out.println(firstPart);
			System.out.println(secondPart);
			var firstCount = firstPart.chars().filter(ch -> ch =='a').count();
			var secondCount = secondPart.chars().filter(ch -> ch =='a').count();
			System.out.println("k"+"a".repeat((int) (firstCount*secondCount)));
			i++;
		}
	}
}
