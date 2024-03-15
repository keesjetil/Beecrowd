import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Assignment1958 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var scanned = scn.next();
        double inputNo = new BigDecimal(scanned).doubleValue();
        var symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setExponentSeparator((inputNo < 1 && inputNo > -1 && inputNo != 0) ? "E" : "E+");
        var numFormat = new DecimalFormat("0.0000E00",symbols);
        if(scanned.charAt(0) == '-'){
            numFormat.setPositivePrefix("-");
            numFormat.setNegativePrefix("-");
        }else{
            numFormat.setPositivePrefix("+");
            numFormat.setNegativePrefix("-");
        }

        System.out.println(numFormat.format(inputNo));

    }
}
