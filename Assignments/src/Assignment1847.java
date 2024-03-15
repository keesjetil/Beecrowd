import java.util.Scanner;

public class Assignment1847 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var A = scn.nextInt();
        var B = scn.nextInt();
        var C = scn.nextInt();

        if(B<A && C>=B){
            System.out.println(":)");
        }if(B>A && C<=B){
            System.out.println(":(");
        }if(B>A && C>B){
            if(B-A > C-B){
                System.out.println(":(");
            }else{
                System.out.println(":)");
            }
        }
        if(B<A && C<B){
            if(B-A < C-B){
                System.out.println(":)");
            }else{
                System.out.println(":(");
            }
        }

        if(B-A == 0){
            if(C > B){
                System.out.println(":)");
            }else{
                System.out.println(":(");
            }
        }
    }
}
