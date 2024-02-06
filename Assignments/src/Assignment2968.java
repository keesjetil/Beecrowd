import java.util.Scanner;

public class Assignment2968
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var laps = scanner.nextInt();
		var flags = scanner.nextInt();
		var totalFlags = laps * flags;
		for(var i=1; i<10; i++){
			if(i!=9){
				System.out.print((int) Math.ceil(Math.round(i*0.10*totalFlags*100.000000)/100.000000) + " ");
			}else{
				System.out.println((int) Math.ceil(Math.round(i*0.10*totalFlags*100.000000)/100.000000));
			}
		}
	}
}
