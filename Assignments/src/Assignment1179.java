import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1179 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var counter = 0;
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        while(counter != 15){
            int nextInt = scn.nextInt();
            if(nextInt % 2 == 0){
                par.add(nextInt);
            }else{
                impar.add(nextInt);
            }

            if(impar.size() == 5){
                for(int i =0; i<impar.size(); i++){
                    System.out.printf("impar[%d] = %d%n", i, impar.get(i));
                }
                impar.clear();
            }

            if(par.size() == 5){
                for(int i =0; i<par.size(); i++){
                    System.out.printf("par[%d] = %d%n", i, par.get(i));
                }
                par.clear();
            }
            counter ++;
        }

        for(int i =0; i<impar.size(); i++){
            System.out.printf("impar[%d] = %d%n", i, impar.get(i));
        }

        for(int i =0; i<par.size(); i++){
            System.out.printf("par[%d] = %d%n", i, par.get(i));
        }


    }

}
