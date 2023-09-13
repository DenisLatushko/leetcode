package algorithms.leetcode.medium

/**
 * Description: https://leetcode.com/problems/simple-bank-system/
 */

class Bank(balance: LongArray) {

    private val accountsBalance = balance

    fun transfer(account1: Int, account2: Int, money: Long): Boolean =
        if (hasAccount(account1) && hasAccount(account2) && hasEnoughMoney(account1, money)) {
            subtractMoney(account1, money)
            addMoney(account2, money)
            true
        } else {
            false
        }

    fun deposit(account: Int, money: Long): Boolean =
        if (hasAccount(account)) {
            addMoney(account, money)
            true
        } else {
            false
        }

    fun withdraw(account: Int, money: Long): Boolean =
        if (hasAccount(account) && hasEnoughMoney(account, money)) {
            subtractMoney(account, money)
            true
        } else {
            false
        }

    private fun hasAccount(account: Int): Boolean = account > 0 && account <= accountsBalance.size

    private fun hasEnoughMoney(account: Int, money: Long): Boolean = accountsBalance[account - 1] >= money

    private fun addMoney(account: Int, money: Long) {
        accountsBalance[account - 1] += money
    }

    private fun subtractMoney(account: Int, money: Long) {
        accountsBalance[account - 1] -= money
    }
}