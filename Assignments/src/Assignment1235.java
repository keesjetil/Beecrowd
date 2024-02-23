import java.util.Scanner;

public class Assignment1235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<N; i++){
            var nextString = sc.nextLine();
            StringBuilder sub1 = new StringBuilder(nextString.substring(0,(nextString.length()/2)));
            StringBuilder sub2 = new StringBuilder(nextString.substring(nextString.length()/2));
            System.out.println(sub1.reverse().append(sub2.reverse()));
        }
        sc.close();
    }
}
