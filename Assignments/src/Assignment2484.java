import java.util.Scanner;

public class Assignment2484 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNext()){
            var word = scn.next();
            var count = 0;
            while(word.length() != 0){
                var spacedWord = word.replace(""," ").substring(1);
                System.out.printf(" ".repeat(count) + "%s%n",spacedWord.substring(0,spacedWord.length()-1));
                count ++;
                word = word.substring(0,word.length()-1);
            }
            System.out.println();
        }
    }
}
