import java.util.Scanner;

public class Assignment1118
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var flag = 1;
		while(flag != 2){
			var x = scanner.nextDouble();
			while(10 < x || x <= 0){
				System.out.println("nota invalida");
				x = scanner.nextDouble();
			}

			var y = scanner.nextDouble();
			while(10 < y || y <= 0){
				System.out.println("nota invalida");
				y = scanner.nextDouble();
			}

			double avg = (x + y) / 2;
			System.out.println(String.format("media = %.2f", avg));

			System.out.println("novo calculo (1-sim 2-nao)");
			flag = scanner.nextInt();
			while (flag != 1 && flag != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				flag = scanner.nextInt();
			}
		}
	}
}
