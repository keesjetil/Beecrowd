import java.util.Scanner;

public class Assignment2060 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var testCases = scn.nextInt();
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for(int i =0; i< testCases; i++){
            var N = scn.nextInt();
            if(N % 2 == 0){
                count2++;
            }
            if(N % 3 ==0){
                count3 ++;
            }
            if(N % 4 == 0){
                count4++;
            }
            if(N % 5 ==0){
                count5 ++;
            }
        }
        System.out.printf("%d Multiplo(s) de 2%n", count2);
        System.out.printf("%d Multiplo(s) de 3%n", count3);
        System.out.printf("%d Multiplo(s) de 4%n", count4);
        System.out.printf("%d Multiplo(s) de 5%n", count5);
    }
}
