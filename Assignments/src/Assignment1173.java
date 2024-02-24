import java.util.Scanner;

public class Assignment1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var initial = sc.nextInt();
        System.out.printf("N[%d] = %d%n",0,initial);
        for(int i=1; i<10; i++){
            initial = initial*2;
            System.out.printf("N[%d] = %d%n",i,initial);
        }
    }
}
