import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment3159 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var testCases = Integer.parseInt(scn.nextLine());
        for(int i=0; i< testCases; i++){
            String sentence = scn.nextLine();
            StringBuilder sb = new StringBuilder();
            int lastKey = -1;
            for(char c: sentence.toCharArray()){
                switch(c){
                    case 'a':
                        sb.append(lastKey == 2 ?"*2":"2");
                        lastKey = 2;break;
                    case 'b':
                        sb.append(lastKey == 2 ?"*22": "22");
                        lastKey = 2;break;
                    case 'c':
                        sb.append(lastKey == 2 ?"*222":"222");
                        lastKey = 2;break;
                    case 'd':
                        sb.append(lastKey == 3 ?"*3":"3");
                        lastKey = 3;break;
                    case 'e':
                        sb.append(lastKey == 3 ?"*33":"33");
                        lastKey = 3;break;
                    case 'f':
                        sb.append(lastKey == 3 ?"*333":"333");
                        lastKey = 3;break;
                    case 'g':
                        sb.append(lastKey == 4 ?"*4":"4");
                        lastKey = 4;break;
                    case 'h':
                        sb.append(lastKey == 4 ?"*44":"44");
                        lastKey = 4;break;
                    case 'i':
                        sb.append(lastKey == 4 ?"*444":"444");
                        lastKey = 4;break;
                    case 'j':
                        sb.append(lastKey == 5 ?"*5":"5");
                        lastKey = 5;break;
                    case 'k':
                        sb.append(lastKey == 5 ?"*55":"55");
                        lastKey = 5;break;
                    case 'l':
                        sb.append(lastKey == 5 ?"*555":"555");
                        lastKey = 5;break;
                    case 'm':
                        sb.append(lastKey == 6 ?"*6":"6");
                        lastKey = 6;break;
                    case 'n':
                        sb.append(lastKey == 6 ?"*66":"66");
                        lastKey = 6;break;
                    case 'o':
                        sb.append(lastKey == 6 ?"*666":"666");
                        lastKey = 6;break;
                    case 'p':
                        sb.append(lastKey == 7 ?"*7":"7");
                        lastKey = 7;break;
                    case 'q':
                        sb.append(lastKey == 7 ?"*77":"77");
                        lastKey = 7;break;
                    case 'r':
                        sb.append(lastKey == 7 ?"*777":"777");
                        lastKey = 7;break;
                    case 's':
                        sb.append(lastKey == 7 ?"*7777":"7777");
                        lastKey = 7;break;
                    case 't':
                        sb.append(lastKey == 8 ?"*8":"8");
                        lastKey = 8;break;
                    case 'u':
                        sb.append(lastKey == 8 ?"*88":"88");
                        lastKey = 8;break;
                    case 'v':
                        sb.append(lastKey == 8 ?"*888":"888");
                        lastKey = 8;break;
                    case 'w':
                        sb.append(lastKey == 9 ?"*9":"9");
                        lastKey = 9;break;
                    case 'x':
                        sb.append(lastKey == 9 ?"*99":"99");
                        lastKey = 9;break;
                    case 'y':
                        sb.append(lastKey == 9 ?"*999":"999");
                        lastKey = 9;break;
                    case 'z':
                        sb.append(lastKey == 9 ?"*9999":"9999");
                        lastKey = 9;break;
                    case ' ':
                        sb.append(lastKey == 0 ?"*0":"0");
                        lastKey = 0;break;
                    case 'A':
                        sb.append("#2");
                        lastKey = 2;break;
                    case 'B':
                        sb.append("#22");
                        lastKey = 2;break;
                    case 'C':
                        sb.append("#222");
                        lastKey = 2;break;
                    case 'D':
                        sb.append("#3");
                        lastKey = 3;break;
                    case 'E':
                        sb.append("#33");
                        lastKey = 3;break;
                    case 'F':
                        sb.append("#333");
                        lastKey = 3;break;
                    case 'G':
                        sb.append("#4");
                        lastKey = 4;break;
                    case 'H':
                        sb.append("#44");
                        lastKey = 4;break;
                    case 'I':
                        sb.append("#444");
                        lastKey = 4;break;
                    case 'J':
                        sb.append("#5");
                        lastKey = 5;break;
                    case 'K':
                        sb.append("#55");
                        lastKey = 5;break;
                    case 'L':
                        sb.append("#555");
                        lastKey = 5;break;
                    case 'M':
                        sb.append("#6");
                        lastKey = 6;break;
                    case 'N':
                        sb.append("#66");
                        lastKey = 6;break;
                    case 'O':
                        sb.append("#666");
                        lastKey = 6;break;
                    case 'P':
                        sb.append("#7");
                        lastKey = 7;break;
                    case 'Q':
                        sb.append("#77");
                        lastKey = 7;break;
                    case 'R':
                        sb.append("#777");
                        lastKey = 7;break;
                    case 'S':
                        sb.append("#7777");
                        lastKey = 7;break;
                    case 'T':
                        sb.append("#8");
                        lastKey = 8;break;
                    case 'U':
                        sb.append("#88");
                        lastKey = 8;break;
                    case 'V':
                        sb.append("#888");
                        lastKey = 8;break;
                    case 'W':
                        sb.append("#9");
                        lastKey = 9;break;
                    case 'X':
                        sb.append("#99");
                        lastKey = 9;break;
                    case 'Y':
                        sb.append("#999");
                        lastKey = 9;break;
                    case 'Z':
                        sb.append("#9999");
                        lastKey = 9;break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
