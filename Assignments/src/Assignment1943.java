import java.util.Scanner;

public class Assignment1943 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var N = scn.nextInt();
        if(N == 1){
            System.out.println("Top 1");
        }else if(N <=3){
            System.out.println("Top 3");
        }else if(N <=5){
            System.out.println("Top 5");
        }else if(N <=10){
            System.out.println("Top 10");
        }else if(N <=25){
            System.out.println("Top 25");
        }else if(N <=50){
            System.out.println("Top 50");
        }else{
            System.out.println("Top 100");
        }
    }
}
