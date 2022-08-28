import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HammingTest {

    @CsvSource(value = {
            "k|kathrin|-1",
            "karolin|kathrin|4",
            "karolin|kerstin|4",
            "kathrin|kerstin|3",
            "GAGCCTACTAACGGGAT|CATCGTAATGACGGCCT|10"
            }, delimiter = '|')
    @ParameterizedTest
    void addUpTo(String original, String second, int value) {
        Assertions.assertEquals(value, Hamming.hamming(original, second, value));
    }

}