public class Assignment1156 {
    public static void main(String[] args) {
        double S = 1;
        for(int i=3,j=2; i <=39; i+=2, j*= 2){
            S += (double) i / j;
        }


        System.out.printf("%.2f\n",S);
    }
}
