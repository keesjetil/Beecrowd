import java.util.Scanner;

public class Assignment1066
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var i = scanner.nextInt();
		var evenScore = 0;
		var oddScore = 0;
		var positiveScore = 0;
		var negativeScore = 0;
		if(i%2==0){
			evenScore += 1;
		}
		if(i%2 == 1){
			oddScore += 1;
		}
		if(i<0){
			negativeScore += 1;
		}
		if(i>0){
			positiveScore += 1;
		}
		while(scanner.hasNextInt()){
			i = scanner.nextInt();
			if(i%2==0){
				evenScore += 1;
			}
			if(i%2 == 1){
				oddScore += 1;
			}
			if(i<0){
				negativeScore += 1;
			}
			if(i>0){
				positiveScore += 1;
			}
		}
		scanner.close();

		System.out.println(evenScore + " valor(es) par(es)");
		System.out.println(oddScore + " valor(es) impar(es)");
		System.out.println(positiveScore + " valor(es) positivo(s)");
		System.out.println(negativeScore + " valor(es) negativo(s)");
	}
}
