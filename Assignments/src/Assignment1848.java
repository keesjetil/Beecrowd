import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1848 {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        var count = 0;
        var sum = 0;
        while(count < 3) {
            String next = scn.nextLine();
            if(next.equals("caw caw")){
                count ++;
                System.out.println(sum);
                sum = 0;
            }else{
                var binary = next.replace('*','1').replace('-', '0');
                sum += Integer.parseInt(binary,2);
            }
        }
        scn.close();
    }
}
