import java.util.Scanner;

public class Assignment3342 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var a = scn.nextInt();
        var b = a*a;

        if(a%2 == 1){
            System.out.printf("%s casas brancas e %s casas pretas%n", b/2+1, b/2);
        }else{
            System.out.printf("%s casas brancas e %s casas pretas%n", b/2,b/2);
        }
    }
}
