import java.util.Scanner;

public class Assignment1154 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var N = 0.0;
        var sum = 0.0;
        var count = 0;
        do {
            N = scn.nextDouble();
            if(N >= 0){
                count ++;
                sum += N;
            }
        }while(N >= 0);

        System.out.printf("%.2f\n",sum / count);
    }
}
