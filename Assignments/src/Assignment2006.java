import java.util.Scanner;

public class Assignment2006
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int teaType = sc.nextInt();
		var score = 0;
		for(int i=0; i<5; i++){
			if(teaType == sc.nextInt()){
				score +=1;
			}
		}
		System.out.println(score);
	}
}
