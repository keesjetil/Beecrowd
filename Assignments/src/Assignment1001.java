import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment1001
{
	public static String sumValues(String filePath){
		var file = new File(filePath);
		var A = 0;
		var B = 0;
		try {
			Scanner scanner = new Scanner(file);
			var linesCount = 0;
			while (scanner.hasNextLine()) {
				if(linesCount ==0){
					A = Integer.parseInt(scanner.nextLine());
				}
				if(linesCount == 1){
					B = Integer.parseInt(scanner.nextLine());
				}
				linesCount += 1;
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return "X = " + (A + B);
	};

	public static void main(String[] args)
	{
		var filePath = "src/Assignment1001Input.txt";
		System.out.println(sumValues(filePath));
		System.out.println("Test1");
		System.out.println("Test2");
		System.out.println("Test3");
	}
}
