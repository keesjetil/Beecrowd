import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Assignment1103
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int H_1 = sc.nextInt();
		int M_1 = sc.nextInt();
		int H_2 = sc.nextInt();
		int M_2 = sc.nextInt();
		var listOfMinutes = new ArrayList<Long>();
		boolean allZero = H_1 == 0 && M_1 == 0 && H_2 == 0 && M_2 == 0;
		while(!allZero){
			Calendar cal_1 = Calendar.getInstance();
			cal_1.set(Calendar.HOUR_OF_DAY, H_1);
			cal_1.set(Calendar.MINUTE, M_1);
			cal_1.set(Calendar.DAY_OF_YEAR,5);

			Calendar cal_2 = Calendar.getInstance();
			cal_2.set(Calendar.HOUR_OF_DAY, H_2);
			cal_2.set(Calendar.MINUTE, M_2);
			cal_2.set(Calendar.DAY_OF_YEAR,5);

			if(cal_2.getTime().getTime() <= cal_1.getTime().getTime()){
				cal_2.set(Calendar.DAY_OF_YEAR,6);
			}
			long diff = (cal_2.getTime().getTime() - cal_1.getTime().getTime())/1000/60;
			listOfMinutes.add(diff);
			H_1 = sc.nextInt();
			M_1 = sc.nextInt();
			H_2 = sc.nextInt();
			M_2 = sc.nextInt();
			allZero = H_1 == 0 && M_1 == 0 && H_2 == 0 && M_2 == 0;
		}
		for(var i=0;i<listOfMinutes.size();i++){
			System.out.println(listOfMinutes.get(i));
		}
	}
}
