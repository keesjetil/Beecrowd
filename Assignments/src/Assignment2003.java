import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment2003 {
    public static void main(String[] args) throws ParseException {
        var scn = new Scanner(System.in);
        while (scn.hasNextLine()) {
            var str = scn.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("H:mm");
            Date d1 = format.parse(str);
            Date d2 = format.parse("7:00");

            long diff = (d2.getTime() - d1.getTime()) / 1000 / 60;
            if(diff < 0){
                System.out.printf("Atraso maximo: %d%n", Math.abs(diff));
            }else{
                System.out.printf("Atraso maximo: %d%n", 0);
            }

        }
    }
}
