package com.katas.demo

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertTrue

class BombTest {
    @Test
    fun shouldNotExplode() {
        Bomb().defuse(
            listOf(
                CableColour.WHITE,
                CableColour.RED,
                CableColour.GREEN,
                CableColour.WHITE,
            )
        )

        assertTrue(true, "Bomb has not exploded")
    }

    @Test
    fun shouldExplode() {
        assertThrows<BoomException> {
            Bomb().defuse(
                listOf(
                    CableColour.WHITE,
                    CableColour.ORANGE,
                    CableColour.GREEN,
                    CableColour.WHITE
                )
            )
        }
    }
}
