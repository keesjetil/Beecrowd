import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment2482 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);

        Map<String,String> transMap = new HashMap<String, String>();
        var n = scn.nextInt();
        for(int i=0; i< n; i++){
            var language = scn.next();
            scn.nextLine();
            var translation = scn.nextLine();
            transMap.put(language, translation);
        }

        var m = scn.nextInt();
        for(int j=0; j< m; j++){
            scn.nextLine();
            var fullName = scn.nextLine();
            var language = scn.next();
            var trans = transMap.get(language);

            System.out.println(fullName);
            System.out.println(trans);
            System.out.println();
        }
    }
}
