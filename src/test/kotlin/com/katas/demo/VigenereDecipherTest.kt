package com.katas.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class VigenereDecipherTest {
    private lateinit var decipher: VigenereDecipher

    @BeforeEach
    fun setUp() {
        decipher = VigenereDecipher()
    }

    @Test
    fun `should decode given keyword KITTY`() {
        val keyword = "KITTY"
        val cipheredText = "CPHPKOBAXKYVXR"
        val expectedPlaintext = "SHOWMETHEMONEY"
        val plainText = decipher.execute(cipheredText, keyword)
        Assertions.assertEquals(expectedPlaintext, plainText)
    }
}
