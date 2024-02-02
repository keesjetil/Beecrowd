import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1024
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		var number = scanner.nextInt();
		var listOfString = new ArrayList<String>();
		for(var i=0; i<number; i++){
			var string = scanner.next();
			StringBuilder sb = new StringBuilder();

			String encrypt1 = encryptString(string);
			sb.append(encrypt1);
			sb.reverse();

			String encrypt2 = encryptString2(sb.toString());
			listOfString.add(encrypt2);
		}
		for(String s: listOfString){
			System.out.println(s);
		}
	}


	private static String encryptString(String str)
	{
		// Traverse the string
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))){
				int newChar = (int) str.charAt(i) + 3;
				stringBuilder.append((char) newChar);
			}else{
				stringBuilder.append(str.charAt(i));
			}
		}
		return stringBuilder.toString();
	}

	private static String encryptString2(String str)
	{
		// Traverse the string
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(i < str.length()/2){
				stringBuilder.append(str.charAt(i));
			}else{
				int newChar = (int) str.charAt(i) -1;
				stringBuilder.append((char) newChar);
			}
		}
		return stringBuilder.toString();
	}
}
