import java.util.Scanner;

public class Assignment1043
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var N_1 = scanner.nextDouble();
		var N_2 = scanner.nextDouble();
		var N_3 = scanner.nextDouble();
		if(isTriangle(N_1,N_2,N_3)){
			System.out.printf("Perimetro = %.1f\n", N_1+N_2+N_3);
		}else{
			System.out.printf("Area: %.1f\n", 0.5* (N_1+N_2)*N_3);
		}
	}
	private static boolean isTriangle(double a, double b, double c){
		if(a+b> c && a+c > b && b+c > a){
			return true;
		}
		return false;
	}
}
