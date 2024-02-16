import java.util.Scanner;

public class Assignment1150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        var Z = scanner.nextInt();
        while(Z<=X){
            Z= scanner.nextInt();
        }

        var count = 0;
        var sum = 0;
        for(int i=X; i<=Z; i++){
            sum += i;
            count += 1;
            if(sum > Z){
                break;
            }
        }
        System.out.println(count);
    }
}
