import java.util.Scanner;

public class Assignment2866 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var testCases = scn.nextInt();
        for(int i=0; i<testCases; i++){
            var wordToDecode = scn.next().toCharArray();
            var sb = new StringBuilder();
            for(int j=0; j< wordToDecode.length; j++){
                if(Character.isLowerCase(wordToDecode[j])){
                    sb.append(wordToDecode[j]);
                }
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
