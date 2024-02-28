import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1180 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int totalNums = scn.nextInt();
        var count = 0;
        ArrayList<Integer> intList = new ArrayList<>();
        while(count != totalNums){
            intList.add(scn.nextInt());
            count ++;
        }

        var min = Integer.MAX_VALUE;
        var pos = Integer.MAX_VALUE;
        for(int i = 0; i< intList.size(); i++){
            if(intList.get(i) < min){
                min = intList.get(i);
                pos = i;
            }
        }

        System.out.println("Menor valor: "+ min);
        System.out.println("Posicao: "+ pos);

    }
}
