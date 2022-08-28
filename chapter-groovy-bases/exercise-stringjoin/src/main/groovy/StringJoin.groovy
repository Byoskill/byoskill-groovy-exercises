class StringJoin {
    static String stringjoin(List<String> strs) {
        return strs
                .findAll { !it.isBlank() }
                .inject("", { prev, it -> prev.isEmpty() ? it : prev + ", " + it })
    }
}