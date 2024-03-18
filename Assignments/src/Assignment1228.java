import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment1228 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNextLine()){
            var testCases = Integer.parseInt(scn.nextLine());

            var initialStringGrid = scn.nextLine().split(" ");
            var finalStringGrid = scn.nextLine().split(" ");
            List<Integer> initial = new ArrayList<Integer>();
            List<Integer> finalGrid = new ArrayList<Integer>();
            for(int i =0; i<testCases; i++){
                initial.add(Integer.parseInt(initialStringGrid[i]));
                finalGrid.add(Integer.parseInt(finalStringGrid[i]));
            }

            var swapCounter = 0;
            for(int k=0; k< finalGrid.size(); k++){
                var element = finalGrid.get(k);
                var elementInit = initial.indexOf(element);
                while(elementInit != k){
                    if(elementInit > k){
                        Collections.swap(initial,elementInit, elementInit -1);
                        elementInit = elementInit - 1;
                        swapCounter += 1;
                    }else{
                        Collections.swap(initial,elementInit, elementInit +1);
                        elementInit = elementInit + 1;
                        swapCounter += 1;
                    }
                }
            }
            System.out.println(swapCounter);
        }
    }
}
