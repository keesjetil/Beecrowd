import java.util.Scanner;

public class Assignment1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var N = sc.nextInt();
        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int sum = 0;
            for(int j=1; j<=x/2; j++) {
                if(x%j == 0){
                    sum += j;
                }
            }
            if(sum == x){
                System.out.printf("%d eh perfeito%n",x);
            }else {
                System.out.printf("%d nao eh perfeito%n", x);
            }
        }
    }
}
