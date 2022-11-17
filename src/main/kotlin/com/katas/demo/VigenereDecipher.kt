package com.katas.demo

class VigenereDecipher {

    fun execute(cipheredText: String, keyword: String): String {
        val dictionary = mapOf(
            "A" to 0, "B" to 1, "C" to 2, "D" to 3, "E" to 4, "F" to 5,
            "G" to 6, "H" to 7, "I" to 8, "J" to 9, "K" to 10, "L" to 11,
            "M" to 12, "N" to 13, "O" to 14, "P" to 15, "Q" to 16,
            "R" to 17, "S" to 18, "T" to 19, "U" to 20, "V" to 21,
            "W" to 22, "X" to 23, "Y" to 24, "Z" to 25,
        )

        val fullKeyword = createFullKeyword(cipheredText, keyword)

        val cipheredTextTransformed = cipheredText.map { letter ->
            dictionary.getValue(letter.toString())
        }

        val keywordTransformed = fullKeyword.map { letter ->
            dictionary.getValue(letter.toString())
        }

        println(fullKeyword)
        println(cipheredTextTransformed)
        println(keywordTransformed)

        return decode(cipheredTextTransformed, dictionary, keywordTransformed)
    }

    private fun decode(
        cipheredTextTransformed: List<Int>,
        dictionary: Map<String, Int>,
        keywordTransformed: List<Int>
    ): String {
        var plainText = ""

        for (position in 0 until cipheredTextTransformed.count()) {
            plainText += dictionary.filterValues {
                it == (cipheredTextTransformed[position] - keywordTransformed[position]).mod(26)
            }.keys.joinToString("")
        }
        return plainText
    }

    private fun createFullKeyword(plainText: String, keyword: String): String {
        var fullKeyword = ""
        var plainTextLength = plainText.length

        while (keyword.length <= plainTextLength) {
            fullKeyword += keyword
            plainTextLength -= keyword.length
            if (plainTextLength < keyword.length) {
                fullKeyword += keyword.substring(0, plainTextLength)
            }
        }
        return fullKeyword
    }
}
