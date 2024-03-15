import java.util.Scanner;

public class Assignment2702 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var C1 = scn.nextInt();
        var B1 = scn.nextInt();
        var A1 = scn.nextInt();

        var C2 = scn.nextInt();
        var B2 = scn.nextInt();
        var A2 = scn.nextInt();

        int sum = 0;
        var diffC = C2-C1;
        var diffB = B2-B1;
        var diffA = A2-A1;

        if(diffC > 0){
            sum += diffC;
        }
        if(diffB > 0){
            sum += diffB;
        }
        if(diffA > 0){
            sum += diffA;
        }

        System.out.println(sum);
    }
}
