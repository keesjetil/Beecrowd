import java.util.*;

public class Assignment1243 {

    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        while(scn.hasNextLine()){
            var line = scn.nextLine();
            List<String> strList = Arrays.stream(line.split(" ")).toList();
            List<Integer> scores = new ArrayList<>();
            for(String s: strList){
                if(s.isEmpty()) {
                    continue;
                }

                var trimmed = s.trim();
                if((trimmed.substring(0,trimmed.length()-1).matches("[a-zA-Z]+") && trimmed.charAt(trimmed.length()-1)=='.')){
                    scores.add(trimmed.length()-1);
                }
                else if(trimmed.matches("[a-zA-Z]+")){
                    scores.add(trimmed.length());
                }

            }

            double avg = scores.stream().mapToInt(a -> a).average().orElse(0);
            if(avg <= 3){
                System.out.println(250);
            }else if(avg == 4 || avg == 5){
                System.out.println(500);
            }else if(avg >= 6){
                System.out.println(1000);
            }
        }
        scn.close();
    }
}
