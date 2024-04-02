import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment1984 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var str = new ArrayList<>(List.of(scn.next().split("")));
        Collections.reverse(str);
        System.out.println(String.join("", str));
    }
}
