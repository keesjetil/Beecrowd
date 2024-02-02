import java.util.Scanner;

public class Assignment1099
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var n1 = scn.nextInt();
		var i =0;
		while(i<n1){
			var a = scn.nextInt();
			var b = scn.nextInt();
			var sum = 0;
			for(var j=Math.min(a,b)+1; j<Math.max(a,b); j++){
				if(j%2==1){
					sum += j;
				}
			}
			System.out.println(sum);
			i++;
		}

	}
}
