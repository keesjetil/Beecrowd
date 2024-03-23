import java.util.Scanner;

public class Assignment1962 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var testCases = scn.next();
        for(int i=0; i< Long.parseLong(testCases);i++){
            var A = scn.next();
            if(Long.parseLong(A) >= 2015){
                System.out.println((long) (Long.parseLong(A)-2014) + " A.C.");
            }else{
                System.out.println((long) (2015-Long.parseLong(A)) + " D.C.");
            }
        }
        scn.close();
    }
}
