import java.util.Scanner;

public class Assignment1451 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        while(scn.hasNextLine()){
            var str = scn.nextLine();
            while(str.indexOf('[') != -1 || str.indexOf(']') != -1){
                str = doAlgorythm(str);
            }
            System.out.println(str);
        }
    }

    private static String doAlgorythm(String str) {
        var firstOpenIndex = str.indexOf('[');
        var firstClosingIndex = str.indexOf(']');
        if(firstOpenIndex == -1){
            return str.replaceAll("]", "");
        }else if(firstOpenIndex != -1 && firstClosingIndex != -1){
            //first find last/first Index of [];
            var subString = str.substring(0,firstClosingIndex);
            var lastIndex = subString.lastIndexOf('[');
            if(lastIndex == -1){
                return subString + str.substring(firstClosingIndex+1);
            }
            System.out.println(str.substring(lastIndex+1, firstClosingIndex) + str.substring(0,lastIndex) + str.substring(firstClosingIndex+1));
            return str.substring(lastIndex+1, firstClosingIndex) + str.substring(0,lastIndex) + str.substring(firstClosingIndex+1);
        }else if(firstOpenIndex != -1 && firstClosingIndex == -1){
            var lastIndex = str.lastIndexOf('[');
            if(lastIndex == firstOpenIndex){
                return str.substring(firstOpenIndex+1) + str.substring(0,firstOpenIndex);
            }
            return  str.substring(firstOpenIndex+1, lastIndex) + str.substring(0,firstOpenIndex)+str.substring(lastIndex);
        }
        return str.replaceAll("\\[", "");
    }
}
