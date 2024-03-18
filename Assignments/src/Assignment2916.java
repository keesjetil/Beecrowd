import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2916 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        while(scn.hasNextInt()){
            var N = scn.nextInt();
            var M = scn.nextInt();
            List<Integer> arrList = new ArrayList<Integer>();
            for(int i=0; i<N; i++){
                arrList.add(scn.nextInt());
            }
            arrList.sort((i,j) -> j.compareTo(i));
            long sum = 0;
            for(int j=0; j< M; j++){
                sum += arrList.get(j);
            }
            System.out.println(sum % 1000000007);
        }
        scn.close();
    }
}
