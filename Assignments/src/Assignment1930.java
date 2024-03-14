import java.util.Scanner;

public class Assignment1930 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var a = scn.nextInt();
        var b = scn.nextInt();
        var c = scn.nextInt();
        var d = scn.nextInt();
        var total = (a+b+c+d) - 3;
        System.out.println(total);
    }
}
