import java.util.Scanner;

public class Assignment1239 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        while (scn.hasNext()) {
            String line = scn.nextLine();
            var sbx = new StringBuilder(line);
            while(line.contains("_")){
                sbx.replace(line.indexOf("_"),line.indexOf("_")+1, "<i>");
                var next = sbx.indexOf("_");
                sbx.replace(next,next+1, "</i>");
                line=sbx.toString();
            }

            while(line.contains("*")){
                sbx.replace(line.indexOf("*"),line.indexOf("*")+1, "<b>");
                var next = sbx.indexOf("*");
                sbx.replace(next,next+1, "</b>");
                line=sbx.toString();
            }

            System.out.println(line);
        }
        scn.close();
    }
}
