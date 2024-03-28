import java.util.Scanner;

public class Assignment1983 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var T = scn.nextInt();
        var highestNum = (double) 8.0;
        var highestStudentNum = -1;
        for(int i=0; i<T; i++){
            var studentNum = Integer.parseInt(scn.next());
            var score = Double.parseDouble(scn.next());
            if(score >= highestNum){
                highestNum = score;
                highestStudentNum = studentNum;
            }
        }

        if(highestStudentNum != -1){
            System.out.println(highestStudentNum);
        }else{
            System.out.println("Minimum note not reached");
        }
    }
}
