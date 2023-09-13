package algorithms.leetcode.medium

import org.junit.Assert.assertFalse
import org.junit.Test
import kotlin.test.assertTrue

class SimpleBankSystemTest {

    private val bank = Bank(longArrayOf(10, 100))

    @Test
    fun `given account 1 with enough money and account 2 when call transfer then move money between accounts`() {
        val actualResult = bank.transfer(1, 2, 10)

        assertTrue(actualResult)
    }

    @Test
    fun `given not existing account 1 and account 2 when call transfer then do not move money between accounts`() {
        val actualResult = bank.transfer(10, 2, 10)

        assertFalse(actualResult)
    }

    @Test
    fun `given account 1 and not existing account 2 when call transfer then do not move money between accounts`() {
        val actualResult = bank.transfer(1, 10, 10)

        assertFalse(actualResult)
    }

    @Test
    fun `given account 1 with not enough money and account 2 when transfer then do not move money between accounts`() {
        val actualResult = bank.transfer(1, 2, 20)

        assertFalse(actualResult)
    }

    @Test
    fun `given account 1 with enough money when withdraw then subtract money from account`() {
        val actualResult = bank.withdraw(1, 10)

        assertTrue(actualResult)
    }

    @Test
    fun `given not existing account 1 when withdraw then do not subtract money from account`() {
        val actualResult = bank.withdraw(10, 10)

        assertFalse(actualResult)
    }

    @Test
    fun `given account 1 with not enough money when withdraw then do not subtract money from account`() {
        val actualResult = bank.withdraw(1, 20)

        assertFalse(actualResult)
    }

    @Test
    fun `given existing account when deposit when add money to account`() {
        val actualResult = bank.deposit(1, 20)

        assertTrue(actualResult)
    }

    @Test
    fun `given not existing account when deposit when add money to account`() {
        val actualResult = bank.deposit(10, 20)

        assertFalse(actualResult)
    }
}