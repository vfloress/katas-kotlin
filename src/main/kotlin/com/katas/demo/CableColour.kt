package com.katas.demo

enum class CableColour {
    WHITE {
        override fun allowedNextCables() = listOf(RED, ORANGE, GREEN, PURPLE)
    },
    RED {
        override fun allowedNextCables() = listOf(GREEN)
    },
    BLACK {
        override fun allowedNextCables() = listOf(RED, BLACK, PURPLE)
    },
    ORANGE {
        override fun allowedNextCables() = listOf(RED, BLACK)
    },
    GREEN {
        override fun allowedNextCables() = listOf(ORANGE, WHITE)
    },
    PURPLE {
        override fun allowedNextCables() = listOf(RED, BLACK)
    };

    abstract fun allowedNextCables(): Collection<CableColour>
}
