import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<>();
        for(int i=0; i<20; i++){
            arrList.add(sc.nextInt());
        }

        Collections.reverse(arrList);
        for(int j=0; j<20; j++){
            System.out.printf("N[%d] = %d%n",j,arrList.get(j));
        }
    }
}

