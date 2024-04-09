import java.util.Arrays;
import java.util.Scanner;

public class Assignment1272 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        int lines = scn.nextInt();
        scn.nextLine();
        for(int i=0; i< lines; i++){
            var strList = scn.nextLine().split(" ");
            var sb = new StringBuilder();
            for(int j=0; j<strList.length; j++){
                if(strList[j].trim().length() > 0) {
                    sb.append(strList[j].trim().charAt(0));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
