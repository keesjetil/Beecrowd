import java.util.Scanner;

public class Assignment1029 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var N = scanner.nextInt();
        for(int j = 0; j<N; j++){
            var M = scanner.nextInt();
            var counter = new Counter(0);
            var f = fibonacci(M, counter);
            System.out.printf("fib(%d) = %d calls = %d%n", M, counter.getCount() - 1 , f );
        }
    }

    private static int fibonacci(int N, Counter counter){
        counter.setCount(counter.getCount() + 1);
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        return fibonacci(N-1, counter) + fibonacci( N-2, counter);
    }
}

class Counter {
    int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}