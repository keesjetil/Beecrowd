import java.util.Scanner;

public class Assignment1515 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var testCases = scn.nextInt();
        while(testCases != 0){
            var fastestPlanet = "";
            var fastestYear = Integer.MAX_VALUE;
            for(int j=0; j<testCases; j++){
                var planetName = scn.next();
                var year = scn.nextInt();
                var travel = scn.nextInt();
                if((year - travel) < fastestYear){
                    fastestYear = year - travel;
                    fastestPlanet = planetName;
                }
            }
            System.out.println(fastestPlanet);
            testCases = scn.nextInt();
        }
    }
}
