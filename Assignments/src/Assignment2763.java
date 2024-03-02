import java.util.Arrays;
import java.util.Scanner;

public class Assignment2763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstString = sc.next().split("\\.");
        var stringWithDashes = firstString[firstString.length-1].split("-");
        for(int i =0; i<firstString.length-1; i++){
            System.out.println(firstString[i]);
        }
        for(int j =0; j<stringWithDashes.length; j++){
            System.out.println(stringWithDashes[j]);
        }
    }
}
