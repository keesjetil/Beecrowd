import java.util.Scanner;

public class Assignment1159 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = -1;
        do {
            N = scn.nextInt();
            if(N == 0){
                break;
            }
            var counter = 0;
            var sum = 0;
            while(counter != 5){
                if(N % 2 == 0){
                    sum += N;
                    counter ++;
                }
                N ++;
            }
            System.out.println(sum);
        }while(true);
    }
}
