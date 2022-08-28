class Hamming {
    static int hamming(String original, String second, int value) {
        if (original.length() != second.length()) return -1
        int identical = 0
        for (i in 0..< original.length()) {
            identical +=  (original[i] == second[i]) ? 1: 0
        }
        identical
    }
}