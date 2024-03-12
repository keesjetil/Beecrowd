import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment1803 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<List<String>> arr = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            List<String> a = Arrays.asList(scn.next().split(""));
            arr.add(a);
        }
        scn.close();

        List<Long> arr2 = new ArrayList<>();
        for (int j = 0; j < arr.get(0).size(); j++) {
            StringBuilder sb1 = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb1.append(arr.get(i).get(j));
            }
           arr2.add(Long.parseLong(sb1.toString()));
        }

        var first = arr2.get(0);
        var last = arr2.get(arr2.size()-1);

        arr2.remove(0);
        arr2.remove(arr2.get(arr2.size()-1));

        var sb = new StringBuilder();
        for(long i : arr2){
            char a = (char) ((first * i + last)%257);
            sb.append(a);
        }
        System.out.println(sb.toString());

    }
}

