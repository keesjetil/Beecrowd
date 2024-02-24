import java.util.Scanner;

public class Assignment1237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            var a = sc.nextLine();
            var b = sc.nextLine();
            String str1;
            String str2;
            if (a.length() >= b.length()) {
                str1 = a;
                str2 = b;
            } else {
                str1 = b;
                str2 = a;
            }

            var largest = 0;
            // loop through the shortest string
            for (int i = 0; i <= str2.length() - 1; i++) {
                // if the shortest string has a match, remember the index of largest;
                if (str1.indexOf(str2.charAt(i)) != -1) {
                    var index = i+1;
                    String tempSting = String.valueOf(str2.charAt(i));
                    var shouldContinue = true;
                    while (shouldContinue) {
                        tempSting = str2.substring(i, index);
                        if(index == str2.length()){
                            shouldContinue = false;
                        }else if(!str1.contains(tempSting)){
                            tempSting = str2.substring(i, index-1);
                            shouldContinue = false;
                        }else{
                            index++;
                        }
                    }
                    if (tempSting.length() > largest) {
                        largest = tempSting.length();
                    }
                }
            }
            System.out.println(largest);
        }
    }
}
