import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CapitalizeTest {

    @CsvSource(value = {
            "fleur|Fleur",
            "ceci est une maison|Ceci Est Une Maison",
            }, delimiter = '|')
    @ParameterizedTest
    void addUpTo(String original, String expected) {
        Assertions.assertEquals(expected, Capitalize.capitalize(original));
    }

}