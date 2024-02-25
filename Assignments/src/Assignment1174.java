import java.util.Scanner;

public class Assignment1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<100; i++){
            double d = sc.nextDouble();
            if(d <=10){
                System.out.printf("A[%d] = %.1f%n", i, d);
            }
        }
    }
}
