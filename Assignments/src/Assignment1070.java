import java.util.HashMap;
import java.util.Scanner;

public class Assignment1070
{
	public static void main(String[] args)
	{
		var map = new HashMap<Integer, String>();
		map.put(61,"Brasilia");
		map.put(71,"Salvador");
		map.put(11,"Sao Paulo");
		map.put(21,"Rio de Janeiro");
		map.put(32,"Juiz de Fora");
		map.put(19,"Campinas");
		map.put(27,"Vitoria");
		map.put(31,"Belo Horizonte");

		Scanner scanner = new Scanner(System.in);
		var integer= scanner.nextInt();

		System.out.println(map.get(integer) != null ? map.get(integer) : "DDD nao cadastrado");
	}
}
