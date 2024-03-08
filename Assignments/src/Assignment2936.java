import java.util.Scanner;

public class Assignment2936 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var cu =  scn.nextInt();
        var boit = scn.nextInt();
        var boto = scn.nextInt();
        var map = scn.nextInt();
        var lar = scn.nextInt();

        var sum = 0;
        sum += cu * 300;
        sum += boit * 1500;
        sum += boto * 600;
        sum += map * 1000;
        sum += lar * 150;
        sum += 225;

        System.out.println(sum);

    }
}
