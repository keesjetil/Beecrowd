import java.util.Scanner;

public class Assignment1048
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var i = scanner.nextDouble();
		double newSalary = 0;
		double increase = 0;
		int percentage = 0;
		if(i<=400){
			percentage = 15;
			increase = i * 0.15;
			newSalary = i + increase;

		}else if(400.01<=i && i<=800){
			percentage = 12;
			increase = i * 0.12;
			newSalary = i + increase;
		}else if(800.01<=i && i<=1200) {
			percentage = 10;
			increase = i * 0.1;
			newSalary = i + increase;
		}else if(1200.01<=i && i<=2000) {
			percentage = 7;
			increase = i * 0.07;
			newSalary = i + increase;
		}else{
			percentage = 4;
			increase = i * 0.04;
			newSalary = i + increase;
		}
		System.out.printf("Novo salario: %.2f\n",newSalary);
		System.out.printf("Reajuste ganho: %.2f\n",increase);
		System.out.println("Em percentual: " + percentage + " %");
	}
}
