package com.katas.demo

import kotlin.math.min

class HenryPorterBooks {
    fun getBestPrice(books: List<Int>) = min(
        getPackPriceMakingBiggerPacks(books),
        getPackPriceMakingMoreEquitablePacks(books),
    )

    private fun getPackPriceMakingBiggerPacks(books: List<Int>): Double {
        val packs: MutableList<MutableList<Int>> = mutableListOf()
        books.forEach bookIterator@{ bookId ->
            packs.forEach { currentPack ->
                if (!currentPack.contains(bookId)) {
                    currentPack.add(bookId)
                    return@bookIterator
                }
            }

            packs.add(mutableListOf(bookId))
        }

        var price = 0.0
        price = getPacksPrice(packs, price)

        return price
    }

    private fun getPackPriceMakingMoreEquitablePacks(books: List<Int>): Double {
        val packs: MutableList<MutableList<Int>> = mutableListOf()
        books.forEach bookIterator@{ bookId ->
            packs.sortedBy { it.size }.forEach { currentPack ->
                if (!currentPack.contains(bookId)) {
                    currentPack.add(bookId)
                    return@bookIterator
                }
            }

            packs.add(mutableListOf(bookId))
        }

        var price = 0.0
        price = getPacksPrice(packs, price)

        return price
    }

    private fun getPacksPrice(packs: List<List<Int>>, price: Double): Double {
        var price = price
        packs.forEach { singlePack ->
            val numberOfBooks = singlePack.count()
            val packPrice = numberOfBooks * SINGLE_BOOK_PRICE
            val discount = DISCOUNT_PERCENTAGE[min(numberOfBooks, 5)]!!
            price += packPrice * (100 - discount) / 100
        }

        return price
    }

    companion object {
        const val SINGLE_BOOK_PRICE = 8.0
        val DISCOUNT_PERCENTAGE = mapOf(
            1 to 0,
            2 to 5,
            3 to 10,
            4 to 20,
            5 to 25,
        )
    }
}
