import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment1045
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var i = scanner.nextDouble();
		var j = scanner.nextDouble();
		var k = scanner.nextDouble();

		List<Double> dArr = new ArrayList<>();
		dArr.addAll(List.of(i,j,k));
		Collections.sort(dArr, Collections.reverseOrder());

		var A = dArr.get(0);
		var B = dArr.get(1);
		var C = dArr.get(2);

		int countA = Collections.frequency(dArr,A);
		int countB = Collections.frequency(dArr,B);
		int countC = Collections.frequency(dArr,C);

		if(A.doubleValue() >= (B.doubleValue() + C.doubleValue())){
			System.out.println("NAO FORMA TRIANGULO");
		}else{
			if(Math.pow(A,2) == (Math.pow(B,2)+Math.pow(C,2))){
				System.out.println("TRIANGULO RETANGULO");
			}
			if(Math.pow(A,2) > (Math.pow(B,2)+Math.pow(C,2))){
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(Math.pow(A,2) < (Math.pow(B,2)+Math.pow(C,2))){
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(A.doubleValue() == B.doubleValue() &&  B.doubleValue() == C.doubleValue()){
				System.out.println("TRIANGULO EQUILATERO");
			}
			if(countA == 2 || countB == 2 || countC == 2){
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}
