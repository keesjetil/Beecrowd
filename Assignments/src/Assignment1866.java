import java.util.Scanner;

public class Assignment1866 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var testCases = scn.nextInt();
        for(int i=0; i<testCases; i++){
            var N = scn.nextInt();
            var sum = 0;
            for(int j=0; j<N; j++){
                if(j %2 == 0){
                    sum ++;
                }else{
                    sum --;
                }
            }
            System.out.println(sum);
        }
    }
}
