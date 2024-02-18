import java.util.Scanner;

public class Assignment1150 {
    public static void main(String[] args) {
        hasSameLastDigit(41,22,71);
    }

    public static boolean hasSameLastDigit(int n, int m, int l){
        if(!(isValid(n) && isValid(m) && isValid(l))){
            return false;
        }
        var n_1 = n % 10;
        var m_1 = m % 10;
        var l_1 = l % 10;

        if(n_1 == m_1 || n_1 == l_1 || m_1 == l_1){
            return true;
        }
        return false;
    }

    public static boolean isValid(int n) {
        if(n<10 || n > 1000){
            return false;
        }
        return true;
    }
}
