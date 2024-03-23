import java.util.Scanner;

public class Assignment3224 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var A = scn.next();
        var B = scn.next();

        if(A.indexOf(B) != -1){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
