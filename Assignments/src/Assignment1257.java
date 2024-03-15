import java.util.Scanner;

public class Assignment1257 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var testCases = scn.nextInt();
        for(int i=0;i<testCases; i++){
            var sum = 0;
            var L = scn.nextInt();
            for(int j=0; j<L; j++){
                var elementNo = j;
                var stringToHash = scn.next();
                for(int k=0; k<stringToHash.length(); k++){
                    var positionNo = k;
                    var alphabetChar = stringToHash.toUpperCase().charAt(k);
                    var alphabetNo = (int) alphabetChar - 65;
                    sum += elementNo + positionNo + alphabetNo;
                }
            }
            System.out.println(sum);
        }
    }
}
