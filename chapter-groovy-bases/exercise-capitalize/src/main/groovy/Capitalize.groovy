class Capitalize {
    def static capitalize(String str) {
        def conversion = ""
        def firstLetter = true
        for (i in 0..<str.size()) {
            Character curChar = str[i]
            if (curChar == ' ') {
                // We skip
                firstLetter = true
                conversion += curChar
            } else if (curChar.isLetter()) {
                if (firstLetter) {
                    conversion += Character.toUpperCase(curChar)
                    firstLetter = false
                } else {
                    conversion += curChar
                }
            } else {
                conversion += curChar
            }
        }
        conversion
    }
}