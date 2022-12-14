package treelogy.br.modellibrary.utils;

import java.util.Locale;

public class ConvertUtils {


    public static String asciiToHex(String asciiStr) {
        char[] chars = asciiStr.toCharArray();
        StringBuilder hex = new StringBuilder();
        for (char ch : chars) {
            hex.append(Integer.toHexString((int) ch));
        }
        return hex.toString().toUpperCase(Locale.ROOT);
    }
}
