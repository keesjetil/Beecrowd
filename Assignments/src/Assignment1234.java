import java.util.Scanner;

public class Assignment1234 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        while (scn.hasNextLine()) {
            var str = scn.nextLine();
            var sb = new StringBuilder();
            var capitalCase = true;
            for (int i = 0; i < str.length(); i++) {
                //65 - 90 && 97-122
                if ((str.charAt(i) < 65 || str.charAt(i) > 122) || ((int) str.charAt(i) > 90 && (int) str.charAt(i) < 97)) {
                    sb.append(str.charAt(i));
                } else {
                    if (capitalCase) {
                        sb.append(Character.toUpperCase(str.charAt(i)));
                        capitalCase = false;
                    } else {
                        sb.append(Character.toLowerCase(str.charAt(i)));
                        capitalCase = true;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
