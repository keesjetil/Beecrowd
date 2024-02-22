import java.util.Scanner;

public class Assignment1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var N = sc.nextInt();
        for(int i=0; i<N; i++){
            var sum = 0;
            var Y = sc.next();
            for(int j = 0; j< Y.length(); j++){
                char c = Y.charAt(j);
                switch (c){
                    case '1':
                        sum += 2;
                        break;
                    case '2','3','5':
                        sum += 5;
                        break;
                    case '4':
                        sum += 4;
                        break;
                    case '0','6','9':
                        sum += 6;
                        break;
                    case '7':
                        sum += 3;
                        break;
                    case '8':
                        sum += 7;
                        break;
                }
            }
            System.out.printf("%d leds%n",sum);
        }
    }
}
