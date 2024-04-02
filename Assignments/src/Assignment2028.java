import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment2028 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var caso = 0;
        while(scn.hasNextLine()) {
            caso ++;
            var num = Integer.parseInt(scn.nextLine());
            List<Integer> intList = generateSequence(num);
            System.out.printf(intList.size() == 1 ? "Caso %d: %d numero%n" : "Caso %d: %d numeros%n", caso, intList.size());
            System.out.println(intList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
            System.out.println();
        }
    }

    private static List<Integer> generateSequence(int N) {
        var intList = new ArrayList<Integer>();
        intList.add(0);
        if(N == 0){
            return intList;
        }else{
            for(int i = 1; i<=N; i++){
                for(var j=0; j<i; j++){
                    intList.add(i);
                }
            }
        }
        return intList;
    }
}
