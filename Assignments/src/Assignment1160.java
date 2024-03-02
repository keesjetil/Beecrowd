import java.util.Scanner;

public class Assignment1160 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            int PA = scan.nextInt();
            int PB = scan.nextInt();
            double GA = 0.0;
            double GB = 0.0;
            try{
                GA = scan.nextDouble();
            }catch(Exception e){
                GA = Double.parseDouble(scan.next());
            }

            try{
                GB = scan.nextDouble();
            }catch(Exception e){
                GB = Double.parseDouble(scan.next());

            }

            var count = 0;
            var growA = ((GA / 100));
            var growB = ((GB / 100));
            while(PA <= PB && count < 101) {
                PA += PA * growA;
                PB += PB * growB;
                count += 1;
            }

            if(count <= 100){
                System.out.println(count + " anos.");
            }else{
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}
