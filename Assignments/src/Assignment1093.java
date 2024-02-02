import java.util.Scanner;

//https://en.wikipedia.org/wiki/Gambler%27s_ruin#Unfair_coin_flipping
public class Assignment1093
{
	private static double gambler(int n1, int n2, int at, int d){
		if(at == 3){
			// probabiliy with 50% (Fair Coin)
			return (double)n1/(double)(n1+n2);
		}
		else{
			double n_1 = Math.ceil((double) n1 / (double) d);
			double n_2 = Math.ceil((double) n2 / (double) d);
			// unFair Coin P2 law is the answer for player1
			var p = 1.0 - (6-at)/6.0;
			var q = (6-at)/6.0;
			return (1.0 - Math.pow(q/p,n_1))/(1.0 - Math.pow(q/p,n_1+n_2));
		}

	}

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		var n1 = scn.nextInt();
		var n2 = scn.nextInt();
		var at = scn.nextInt();
		var d = scn.nextInt();
		while(n1 != 0 && n2 != 0 && at !=0 && d!=0){
			System.out.printf("%.1f\n", gambler(n1, n2, at, d)*100);
			n1 = scn.nextInt();
			n2 = scn.nextInt();
			at = scn.nextInt();
			d = scn.nextInt();
		}

	}
}
