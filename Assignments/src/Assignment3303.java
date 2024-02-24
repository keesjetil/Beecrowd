import java.util.Scanner;

public class Assignment3303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var S = scanner.next();
        if(S.length() >= 10){
            System.out.println("palavrao");
        }else{
            System.out.println("palavrinha");
        }
    }
}
