import java.util.Scanner;

public class Assignment1241 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var testCases = scn.nextInt();
        for(int i=0; i< testCases; i++){
            var A = scn.next();
            var B = scn.next();
            var ALen = A.length();
            var BLen = B.length();
            var index = A.lastIndexOf(B);
            if(index < 0) {
                System.out.println("nao encaixa");
                continue;
            }
            if((ALen - BLen) == index){
                System.out.println("encaixa");
            }else{
                System.out.println("nao encaixa");
            }
        }
    }
}
