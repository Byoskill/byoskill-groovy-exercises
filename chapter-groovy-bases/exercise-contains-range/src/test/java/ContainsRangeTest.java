import groovy.lang.IntRange;
import groovy.lang.Range;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ContainsRangeTest {

    @Test
    public void testRanges() {
        assertTrue(ContainsRange.containsRange(5, 7, 5, 7));
        assertTrue(ContainsRange.containsRange(1, 12, 5, 7));
        assertFalse(ContainsRange.containsRange(5, 8, 5, 9));
    }

    @Test
    public void testRanges2() {
        assertTrue(ContainsRange.containsRange2(new IntRange(true, 5, 7), new IntRange(true, 5, 7)));
        assertTrue(ContainsRange.containsRange2(new IntRange(true, 1, 12), new IntRange(true, 5, 7)));
        assertFalse(ContainsRange.containsRange2(new IntRange(true, 5, 8), new IntRange(true, 5, 9)));
    }
}