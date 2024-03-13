import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Assignment2139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            var month = scanner.nextInt();
            var day = scanner.nextInt();
            Date date = new Date(2016, month -1, day);
            Date christmas = new Date(2016, 11, 25);

            long diffInMillies = Math.abs(christmas.getTime() - date.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            if(diff == 0){
                System.out.println("E natal!");
            }
            else if (date.before(christmas) && diff == 1){
                System.out.println("E vespera de natal!");
            }
            else if(date.after(christmas)){
                System.out.println("Ja passou!");
            }else if(date.before(christmas)){
                System.out.printf("Faltam %s dias para o natal!%n", diff);
            }else{
                // do nothing...
            }
        }
        scanner.close();
    }
}
