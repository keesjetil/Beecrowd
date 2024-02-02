import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1030
{
	public static String Game(int i, List<Integer> person, int k, int index)
	{

		// Base case , when only one person is left
		if (person.size() == 1) {
			return "Case " +(i+1) + ": "+person.get(0);
		}

		// find the index of first person which will die
		index = ((index + k) % person.size());

		// remove the first person which is going to be killed
		person.remove(index);

		// recursive call for n-1 persons
		return Game(i, person, k, index);
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var firstInt = scanner.nextInt();
		var listOfStrings = new ArrayList<String>();
		for(var i=0; i< firstInt; i++){
			var n = scanner.nextInt();
			var k = scanner.nextInt();
			k--;
			List<Integer> person = new ArrayList<>();

			// fill the person vector
			for (int j = 1; j <= n; j++) {
				person.add(j);
			}

			int index = 0;
			listOfStrings.add(Game(i, person, k, index));
		}

		for(var str: listOfStrings){
			System.out.println(str);
		}
	}
}
