class ContainsRange {
     static boolean containsRange(int r1_begin, int r1_end, int r2_begin, int r2_end) {
        if (r2_begin < r1_begin) return false;
        if (r2_end <= r1_end) return true;
        return false;
    }

    static boolean containsRange2(r1, r2) {
        r1.containsAll(r2);
    }
}