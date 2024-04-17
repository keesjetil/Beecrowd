import java.util.Scanner;

public class Assignment2694 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            String A = scn.next();
            var B = A.replaceAll("[A-Za-z]", " ").replaceAll(" +", " ").split(" ");
            int sum = 0;
            for (int j = 0; j < B.length; j++) {
                if (!B[j].isEmpty()) {
                    sum += Integer.parseInt(B[j]);
                }
            }
            System.out.println(sum);
        }
    }
}
