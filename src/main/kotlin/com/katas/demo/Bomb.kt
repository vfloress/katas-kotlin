package com.katas.demo

class Bomb {
    private var lastCableCut: CableColour? = null

    fun defuse(cutCables: Collection<CableColour>) {
        cutCables.map { cut(it) }
    }

    private fun cut(cutCable: CableColour) {
        when (lastCableCut) {
            null -> Unit
            CableColour.WHITE ->
                if (listOf(CableColour.WHITE, CableColour.BLACK).contains(cutCable)) {
                    throw BoomException()
                }

            CableColour.RED ->
                if (!listOf(CableColour.GREEN).contains(cutCable)) {
                    throw BoomException()
                }

            CableColour.BLACK ->
                if (listOf(CableColour.WHITE, CableColour.GREEN, CableColour.ORANGE).contains(cutCable)) {
                    throw BoomException()
                }

            CableColour.ORANGE ->
                if (!listOf(CableColour.RED, CableColour.BLACK).contains(cutCable)) {
                    throw BoomException()
                }

            CableColour.GREEN ->
                if (!listOf(CableColour.ORANGE, CableColour.WHITE).contains(cutCable)) {
                    throw BoomException()
                }

            CableColour.PURPLE ->
                if (listOf(CableColour.PURPLE, CableColour.GREEN, CableColour.ORANGE, CableColour.WHITE).contains(
                        cutCable
                    )
                ) {
                    throw BoomException()
                }
        }
        lastCableCut = cutCable
    }
}

enum class CableColour {
    WHITE, RED, BLACK, ORANGE, GREEN, PURPLE
}
