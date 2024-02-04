public class Assignment1097
{
	public static void main(String[] args)
	{
		var max = 7;
		var min = 5;
		for(int i=1; i<=9; i+=2){
			for(int j=max; j>=min; j--){
				System.out.println("I="+i + " J="+j);
			}
			min +=2;
			max += 2;
		}
	}
}
