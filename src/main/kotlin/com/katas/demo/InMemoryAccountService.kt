package com.katas.demo

import java.time.Clock
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class InMemoryAccountService(private var clock: Clock = Clock.systemDefaultZone()) : AccountService {
    private val operations: MutableList<Operation> = mutableListOf()

    fun setClock(clock: Clock) {
        this.clock = clock
    }

    override fun deposit(amount: Int) {
        val lastBalance = operations.lastOrNull()?.balance ?: 0

        val newBalance = lastBalance + amount
        operations.add(
            Operation(
                LocalDate.now(clock),
                amount,
                newBalance
            )
        )
    }

    override fun withdraw(amount: Int) {
        val lastBalance = operations.lastOrNull()?.balance ?: 0

        val newBalance = lastBalance - amount
        operations.add(
            Operation(
                LocalDate.now(clock),
                -amount,
                newBalance
            )
        )
    }

    override fun printStatement(): List<List<String>> {
        val operationsList = operations.sortedByDescending { it.date }.map {
            listOf<String>(
                it.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                it.amount.toString(),
                it.balance.toString()
            )
        }
        return listOf(listOf("Date", "Amount", "Balance")) + operationsList
    }

    private data class Operation(val date: LocalDate, val amount: Int, val balance: Int)
}
