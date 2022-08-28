import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddupToTest {

    @Test
    void addUpTo() {
        Assertions.assertEquals(1, AddupTo.addUpTo(1));
        Assertions.assertEquals(3, AddupTo.addUpTo(2));
        Assertions.assertEquals(6, AddupTo.addUpTo(3));
    }
    
}