import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1253 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        for(var i=0; i<testCases; i++) {
            List<Integer> intArray = scn.next().chars().boxed().toList();
            var stepSize = scn.nextInt();
            StringBuilder sb = new StringBuilder();
            intArray.forEach(integer -> {
                //65-90
                if(integer-stepSize >=65){
                    sb.append((char) (integer-stepSize));
                }else{
                    var diffWithUnderBound = 65-(integer - stepSize);
                    sb.append((char) (90 - diffWithUnderBound + 1));
                }
            });
            System.out.println(sb.toString());

        }
    }
}
