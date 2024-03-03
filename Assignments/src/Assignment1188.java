import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Assignment1188 {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        var T = scn.next();
        List<List<Double>> matrix = createMatrix(scn);

        double sum = 0;
        double count = 0;
        for (int j = matrix.size()-1; j > (matrix.size() / 2); j--) {
            for (int i = matrix.size() - j; i < j; i++) {
                sum += matrix.get(j).get(i);
                count += 1;
            }
        }


        if (T.equals("S")) {
            System.out.printf(Locale.US, "%.1f%n", sum);
        } else {
            System.out.printf(Locale.US, "%.1f%n", sum / count);
        }
    }

    private static List<List<Double>> createMatrix(Scanner scn) {
        List<List<Double>> matrix = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            List<Double> row = new ArrayList<>();
            for (int j = 0; j < 12; j++) {
                try {
                    row.add(scn.nextDouble());
                } catch (Exception e) {
                    row.add((double) scn.nextInt());
                }
            }
            matrix.add(row);
        }
        return matrix;
    }
}
