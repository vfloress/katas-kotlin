package com.katas.demo

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.Clock
import java.time.Instant
import java.time.ZoneId
import kotlin.test.assertEquals

class InMemoryAccountServiceTest {
    private lateinit var inMemoryAccountService: InMemoryAccountService

    @BeforeEach
    fun setup() {
        inMemoryAccountService = InMemoryAccountService()
    }

    @Test
    fun testDepositShouldOutputIt() {
        given1000AreDepositedOn28April()
        val output = whenStatementIsPrinted()
        thenItShouldPrintASingleTransactionOn28April(output)
    }

    @Test
    fun testMultipleDepositsAndWithdrawalsShouldOutputAll() {
        given1000AreDepositedOn10January()
        given2000AreDepositedOn13January()
        given500AreWithdrawnOn14January()
        val output = whenStatementIsPrinted()
        thenItShouldPrintMultipleTransactionStatements(output)
    }

    private fun given1000AreDepositedOn28April() {
        val clock = Clock.fixed(Instant.parse("2022-04-28T12:00:00Z"), ZoneId.of("UTC"))
        inMemoryAccountService.setClock(clock)
        inMemoryAccountService.deposit(1000)
    }

    private fun given1000AreDepositedOn10January() {
        val clock = Clock.fixed(Instant.parse("2012-01-10T12:00:00Z"), ZoneId.of("UTC"))
        inMemoryAccountService.setClock(clock)
        inMemoryAccountService.deposit(1000)
    }

    private fun given2000AreDepositedOn13January() {
        val clock = Clock.fixed(Instant.parse("2012-01-13T12:00:00Z"), ZoneId.of("UTC"))
        inMemoryAccountService.setClock(clock)
        inMemoryAccountService.deposit(2000)
    }

    private fun given500AreWithdrawnOn14January() {
        val clock = Clock.fixed(Instant.parse("2012-01-14T12:00:00Z"), ZoneId.of("UTC"))
        inMemoryAccountService.setClock(clock)
        inMemoryAccountService.withdraw(500)
    }

    private fun whenStatementIsPrinted(): List<List<String>> {
        return inMemoryAccountService.printStatement()
    }

    private fun thenItShouldPrintASingleTransactionOn28April(output: List<List<String>>) {
        assertEquals(
            listOf(
                listOf("Date", "Amount", "Balance"),
                listOf("28/04/2022", "1000", "1000")
            ),
            output
        )
    }

    private fun thenItShouldPrintMultipleTransactionStatements(output: List<List<String>>) {
        assertEquals(
            listOf(
                listOf("Date", "Amount", "Balance"),
                listOf("14/01/2012", "-500", "2500"),
                listOf("13/01/2012", "2000", "3000"),
                listOf("10/01/2012", "1000", "1000"),
            ),
            output
        )
    }
}
