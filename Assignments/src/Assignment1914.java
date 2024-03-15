import java.util.Objects;
import java.util.Scanner;

public class Assignment1914 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var testCases = scn.nextInt();
        for(int i=0; i<testCases; i++){
            var p1 = scn.next();
            var choiceP1 = scn.next();
            var p2 = scn.next();
            var choiceP2 = scn.next();

            var num1 = scn.nextInt();
            var num2 = scn.nextInt();
            int sum = num1 + num2;

            if(sum % 2 == 0){
                if(choiceP2.equals("PAR")){
                    System.out.println(p2);
                }else if(choiceP1.equals("PAR")){
                    System.out.println(p1);
                }else{
                    // do nothing
                }
            }else{
                if(choiceP2.equals("IMPAR")){
                    System.out.println(p2);
                }else if(choiceP1.equals("IMPAR")){
                    System.out.println(p1);
                }else{
                    // do nothing
                }
            }
        }
    }
}
