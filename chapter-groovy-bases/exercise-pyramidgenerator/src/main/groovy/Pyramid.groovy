class Pyramid {


    public static final String CHAR = "#"

    static def pyramid(int n) {
        if (n == 0) return []
        def res = new ArrayList(n-1)
        pyramid(n, n, res)
        return res
    }

    static def pyramid(int size, int level, lines) {
        if (level == 0) return
        int maxChars = 1 + 2 * (size - 1)
        int nbChars = 1 + 2 * (level - 1)
        int colSpace =  (maxChars - nbChars) / 2
        //println "$nbChars $maxChars $colSpace"
        if (level == 1) {
            lines[0] = " ".repeat(colSpace) +CHAR + " ".repeat(colSpace);
            return
        }
        lines[level-1] = " ".repeat(colSpace) + CHAR.repeat(nbChars) + " ".repeat(colSpace)
        pyramid(size, level - 1, lines)
    }
/**
 '    #  '
 '   ###  '  1 + 2 * (level-1)
 '  ##### '   
 ' ####### '

 totalSize =  2 * (level-1)

 ù**/
}
