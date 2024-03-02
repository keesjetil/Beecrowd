import java.util.Scanner;

public class Assignment1145 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var N = scn.nextInt();
        var M = scn.nextInt();
        for(int i = 1; i<= M; i++) {
            if(i%N == 0){
                System.out.println(i);
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
