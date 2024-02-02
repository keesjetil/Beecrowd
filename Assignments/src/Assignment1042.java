import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1042
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var x = scanner.nextInt();
		var y = scanner.nextInt();
		var z = scanner.nextInt();
		var arr = new ArrayList<Integer>();
		arr.add(x);
		arr.add(y);
		arr.add(z);
		var sorted = arr.stream().sorted().toList();

		for(var item: sorted){
			System.out.println(item);
		}
		System.out.println("");
		for(var item: arr){
			System.out.println(item);
		}
	}
}
