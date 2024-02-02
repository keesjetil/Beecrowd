import java.util.Scanner;

public class Assignment1040
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextDouble();
		var N_2 = scanner.nextDouble();
		var N_3 = scanner.nextDouble();
		var N_4 = scanner.nextDouble();
		double N_5 = -1.0;
		var average = average(N_1, N_2, N_3, N_4);

		if( average >= 5 && average < 7){
			if(scanner.hasNext()){
				N_5 = scanner.nextDouble();
			}
			scanner.close();
		}
		System.out.printf("Media: %.1f\n", Math.floor(average*10)/10);
		if (average >= 7)
		{
			System.out.println("Aluno aprovado.");
		}
		else if (average < 5)
		{
			System.out.println("Aluno reprovado.");
		}
		else
		{
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: " + N_5);
			var newAverage = (average + N_5) / 2.0;
			if(newAverage >= 5.0){
				System.out.println("Aluno aprovado.");
			}else{
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", newAverage);

		}
	}
	private static double average(double N_1,double N_2, double N_3, double N_4)
	{
		return (2*N_1 + 3*N_2 + 4*N_3 + N_4) / 10;
	}
}
