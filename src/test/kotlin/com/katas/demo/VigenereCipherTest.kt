package com.katas.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class VigenereCipherTest {
    private lateinit var cipher: VigenereCipher

    @BeforeEach
    fun setUp() {
        cipher = VigenereCipher()
    }

    @Test
    fun `should encode given keyword QUEENS`() {
        val keyword = "QUEENS"
        val plainText = "QUEHAREMOSESTANOCHECEREBRO"
        val expectedTextCiphered = "GOILNJUGSWRKJURSPZUWIVRTHI"
        val textCiphered = cipher.execute(plainText, keyword)
        assertEquals(expectedTextCiphered, textCiphered)
    }

    @Test
    fun `should encode given keyword ROSALIA`() {
        val keyword = "ROSALIA"
        val plainText = "BABYNOMELLAMEQUEYOESTOYOCUPAOLVIDANDOTUSMALE"
        val expectedTextCiphered = "SOTYYWMVZDAXMQLSQOPATFMGCFXAFZNIOINUCLUDUACS"
        val textCiphered = cipher.execute(plainText, keyword)
        assertEquals(expectedTextCiphered, textCiphered)
    }
}
