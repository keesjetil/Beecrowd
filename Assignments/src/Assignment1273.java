import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1273 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N;
        boolean start = true;
        while((N = scn.nextInt()) != 0){
            if(!start) {
                System.out.println();
            }
            if(start) {
                start = false;
            }
            int max = Integer.MIN_VALUE;
            List<String> strList = new ArrayList<>();
            for(int i=0; i<N; i++){
                var name = scn.next();
                if(name.length() > max){
                    max = name.length();
                }
                strList.add(name);
            }

            for(String str : strList){
                System.out.println(str.length() >= max ? str : " ".repeat(max-str.length()) + str);
            }
        }
        scn.close();
    }
}
