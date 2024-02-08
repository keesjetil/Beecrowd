import java.util.Scanner;

public class Assignment1131
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		var X = scanner.nextInt();
		var Y = scanner.nextInt();

		var games = 0;
		var Xwin = 0;
		var Ywin = 0;
		var draw = 0;
		if(X == Y){
			draw += 1;
		}
		if(X < Y){
			Ywin += 1;
		}
		if(X>Y){
			Xwin += 1;
		}

		games += 1;
		int Z;
		System.out.println("Novo grenal (1-sim 2-nao)");
		while((Z = scanner.nextInt()) != 2){
			System.out.println("Novo grenal (1-sim 2-nao)");
			X = scanner.nextInt();
			Y = scanner.nextInt();
			if(X == Y){
				draw += 1;
			}
			if(X < Y){
				Ywin += 1;
			}
			if(X>Y){
				Xwin += 1;
			}

			games += 1;
		}

		System.out.println(games + " grenais");
		System.out.println("Inter:" + Xwin);
		System.out.println("Gremio:"+Ywin);
		System.out.println("Empates:"+draw);
		System.out.println("Inter venceu mais");
	}
}
