import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment1277 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        for(int i=0; i< t; i++){
            var studentNums = scn.nextInt();
            List<String> students = new ArrayList<>();
            List<String> presentRecords = new ArrayList<>();
            for(int j=0; j<studentNums; j++){
                students.add(scn.next());
            }
            for(int j=0; j< studentNums; j++){
                presentRecords.add(scn.next());
            }
            printUnattendStudents(studentNums, students, presentRecords);
        }
    }

    private static void printUnattendStudents(int studentNums, List<String> students, List<String> presentRecords) {
        var sb = new StringBuilder();
        for(int i=0; i<studentNums; i++){
            double countP = presentRecords.get(i).chars().filter(c -> c=='P').count();
            double percentage = (countP / presentRecords.get(i).chars().filter(c -> c!='M').count()) *100;
            if(percentage < 75){
                sb.append(" ").append(students.get(i));
            }
        }
        if(sb.isEmpty()) {
            System.out.println();
        }else{
            System.out.println(sb.substring(1));
        }
    }
}
