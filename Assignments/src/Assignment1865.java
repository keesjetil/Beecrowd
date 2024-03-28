import java.util.Scanner;

public class Assignment1865 {
    public static void main(String[] args) {
        var scn =  new Scanner(System.in);
        var T = scn.nextInt();
        for(int i=0; i< T; i++){
            var S = scn.next();
            var P = scn.nextInt();
            if(S.equals("Thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}
