import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment3479
{
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		var date = sc.next();
		Date date1 = new SimpleDateFormat("dd/MM").parse(date);
		date1.setYear(2023);

		if (date1.after(new Date(2023, 2, 20)) && date1.before((new Date(2023, 3, 21))))
		{
			System.out.println("aries");
		}

		if (date1.after(new Date(2023, 3, 20)) && date1.before((new Date(2023, 4, 21))))
		{
			System.out.println("touro");
		}

		if (date1.after(new Date(2023, 4, 20)) && date1.before((new Date(2023, 5, 21))))
		{
			System.out.println("gemeos");
		}

		if (date1.after(new Date(2023, 5, 20)) && date1.before((new Date(2023, 6, 23))))
		{
			System.out.println("cancer");
		}

		if (date1.after(new Date(2023, 6, 22)) && date1.before((new Date(2023, 7, 23))))
		{
			System.out.println("leao");
		}

		if (date1.after(new Date(2023, 7, 22)) && date1.before((new Date(2023, 8, 23))))
		{
			System.out.println("virgem");
		}

		//-----
		if (date1.after(new Date(2023, 8, 22)) && date1.before((new Date(2023, 9, 23))))
		{
			System.out.println("libra");
		}

		if (date1.after(new Date(2023, 9, 22)) && date1.before((new Date(2023, 10, 22))))
		{
			System.out.println("escorpiao");
		}

		if (date1.after(new Date(2023, 10, 21)) && date1.before((new Date(2023, 11, 22))))
		{
			System.out.println("sagitario");
		}

		if (date1.after(new Date(2023, 11, 21)) || date1.before((new Date(2023, 0, 20))))
		{
			System.out.println("capricornio");
		}

		if (date1.after(new Date(2023, 0, 19)) && date1.before((new Date(2023, 1, 19))))
		{
			System.out.println("aquario");
		}

		if (date1.after(new Date(2023, 1, 18)) && date1.before((new Date(2023, 2, 21))))
		{
			System.out.println("peixes");
		}

	}
}
