import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Assignment2826 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        strList.add(scn.next());
        strList.add(scn.next());
        strList.sort(Comparator.naturalOrder());
        strList.forEach(s -> System.out.println(s));
    }
}
