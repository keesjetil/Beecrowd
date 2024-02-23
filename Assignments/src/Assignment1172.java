import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1172 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> X = new ArrayList<>();
        for (var i = 0; i < 10; i++)
        {
            var N = sc.nextInt();
            if(N <=0){
                X.add(1);
            }else{
                X.add(N);
            }
        }

        for(int i = 0; i<10; i++){
            System.out.printf("X[%d] = %d%n", i,X.get(i));

        }
    }
}
