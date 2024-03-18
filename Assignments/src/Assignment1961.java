import java.util.Scanner;

public class Assignment1961 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int P = scn.nextInt();
        int N = scn.nextInt();
        int firstPipe = scn.nextInt();
        var gameOver = false;
        for(int i=1; i<N; i++){
            var pipeVal = scn.nextInt();
            if(Math.abs(pipeVal - firstPipe) >= P){
                gameOver = true;
                break;
            }
            firstPipe = pipeVal;
        }

        if (gameOver) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("YOU WIN");
        }
    }
}
