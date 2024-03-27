import java.util.Scanner;

public class Assignment1960 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var N = scn.nextInt();
        StringBuilder sb = new StringBuilder();
        while(N != 0){
            if(N>=1000){
                sb.append("M");
                N -= 1000;
            }else if(N>= 900){
                sb.append("CM");
                N -= 900;
            }else if(N>= 500){
                sb.append("D");
                N -= 500;
            }else if(N>= 400){
                sb.append("CD");
                N -= 400;
            }else if(N >= 100){
                sb.append("C");
                N -= 100;
            }else if(N >= 90){
                sb.append("XC");
                N -= 90;
            }else if(N >= 50){
                sb.append("L");
                N -= 50;
            }else if(N >= 40){
                sb.append("XL");
                N -= 40;
            }else if(N >= 10){
                sb.append("X");
                N -= 10;
            }else if(N >= 9){
                sb.append("IX");
                N -= 9;
            }else if(N >= 5){
                sb.append("V");
                N -= 5;
            }else if(N >= 4){
                sb.append("IV");
                N -= 4;
            }else if(N >= 1){
                sb.append("I");
                N -= 1;
            }
        }
        System.out.println(sb);
    }
}
