
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringJoinTest {

    @Test
    void test() {
        assertEquals("", StringJoin.stringjoin(List.of("")));
        assertEquals("a, b", StringJoin.stringjoin(List.of("a", "b")));
        assertEquals("a, b, c", StringJoin.stringjoin(List.of("a", "b", "c")));
        assertEquals("a, b, c", StringJoin.stringjoin(List.of("a","  ", "b", "c")));
    }

}