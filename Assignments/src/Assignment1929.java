import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1929 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(scn.nextInt());
        arrList.add(scn.nextInt());
        arrList.add(scn.nextInt());
        arrList.add(scn.nextInt());
        boolean canCreateTriangle = false;
        for (var el : arrList) {
            var copyArr = new ArrayList<>(arrList);
            copyArr.remove(el);
            if (isArrayTriangular(copyArr.get(0), copyArr.get(1), copyArr.get(2))) {
                canCreateTriangle = true;
                break;
            }
        }

        System.out.println(canCreateTriangle ? "S" : "N");

    }

    private static boolean isArrayTriangular(int A, int B, int C) {
        var max = Math.max(C,Math.max(A,B));
        if (max == C && A + B > C) {
            return true;
        } else if (max == B && A + C > B) {
            return true;
        } else if (max == A && B + C > A) {
            return true;
        } else {
            return false;
        }
    }
}
