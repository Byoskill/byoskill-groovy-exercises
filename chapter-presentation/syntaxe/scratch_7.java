import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static java.util.Collections.unmodifiableList;
import static java.util.Objects.*;

class Scratch {
    public static void main(@NotNull String[] args) {
        Validate.notNull(args);
        requireNonNull(args);
        var v1 = 12;

    }

    private List<Integer> val = new ArrayList<>();

    public List<Integer> getVal() {
        return unmodifiableList(val);
    }

    public void setVal(List<Integer> val) {
        this.val = val;
    }

    public void remove(int index) {
        this.val.remove(index);
    }
}
