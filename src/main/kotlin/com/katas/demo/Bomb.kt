package com.katas.demo

class Bomb {
    private var lastCableCut: CableColour? = null

    fun defuse(cutCables: Collection<CableColour>) {
        cutCables.map { cut(it) }
    }

    private fun cut(cutCable: CableColour) {
        when (lastCableCut) {
            null -> Unit
            else -> checkBombExplodes(cutCable)
        }

        lastCableCut = cutCable
    }

    private fun checkBombExplodes(cutCable: CableColour) {
        if (lastCableCut == null) {
            return
        } else if (!lastCableCut!!.allowedNextCables().contains(cutCable)) {
            throw BoomException()
        }
    }
}

