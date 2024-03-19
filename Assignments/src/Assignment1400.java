import java.util.Scanner;

public class Assignment1400 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();
        var m = scn.nextInt();
        var k = scn.nextInt();
        while(n != 0 && m != 0 && k!=0){
            System.out.println(simulateGame(n,m,k));
            n = scn.nextInt();
            m = scn.nextInt();
            k = scn.nextInt();
        }
    }

    private static int simulateGame(int n, int m, int k){
        var reverse = false;
        var countClaps = 0;
        var currentPerson = 0;
        var currentClap = 0;
        while(true) {
            if(reverse){
                currentPerson --;
                if(currentPerson%n == 1){
                    reverse = false;
                }
            }else{
                currentPerson ++;
                if(currentPerson%n == 0){
                    reverse = true;
                }
            }
            currentClap ++;


            if(((currentClap % 7 == 0) || (String.valueOf(currentClap).indexOf('7') != -1)) && currentPerson == m){
                countClaps ++;
            }


            if(countClaps == k){
                break;
            }
        }
        return currentClap;
    }
}
