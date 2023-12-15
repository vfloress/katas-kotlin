package com.katas.demo

interface AccountService {
    fun deposit(amount: Int)
    fun withdraw(amount: Int)
    fun printStatement(): List<List<String>>
}
