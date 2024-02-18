public class Assignment1155 {
    public static void main(String[] args) {
        double sum = 0.0;
        for(int i=1; i<= 100; i++){
            sum += (double) 1/ (double) i;
        }
        System.out.printf("%.2f\n",sum);
    }
}
