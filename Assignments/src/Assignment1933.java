import java.util.Scanner;

public class Assignment1933 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var A = scn.nextInt();
        var B = scn.nextInt();

        if(A == B){
            System.out.println(A);
        }
        if(A < B){
            System.out.println(B);
        }
        if(B<A){
            System.out.println(A);
        }
    }
}
