import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1120
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		List<BigInteger> arr =  new ArrayList<BigInteger>();

		BigInteger x = scanner.nextBigInteger();
		BigInteger y = scanner.nextBigInteger();

		while(x.toString() != "0" && y.toString() != "0"){
			var result = String.valueOf(y).replace(String.valueOf(x),"");
			if(result == ""){
				arr.add(BigInteger.ZERO);
			}else{
				arr.add(new BigInteger(result));
			}
			x = scanner.nextBigInteger();
			y = scanner.nextBigInteger();
		}

		scanner.close();

		for(BigInteger i: arr){
			System.out.println(i);
		}

	}
}
