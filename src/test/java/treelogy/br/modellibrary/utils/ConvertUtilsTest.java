package treelogy.br.modellibrary.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class ConvertUtilsTest {

    private ConvertUtils convertUtils;

    @Test
    public void ascci_to_hexa_sucess() {
        String msgAscii = "Conversion from ascii to hex status success.";
        String msgHexa = "436f6e76657273696f6e2066726f6d20617363696920746f206865782073746174757320737563636573732e";

        Assertions.assertEquals(msgHexa.toUpperCase(Locale.ROOT), convertUtils.asciiToHex(msgAscii));
    }
}