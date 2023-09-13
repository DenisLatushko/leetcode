package algorithms.leetcode.utils

import org.junit.Assert

fun assertArrayEquals(expected: Array<IntArray>, actual: Array<IntArray>) {
    expected.forEachIndexed { i, arr ->
        Assert.assertArrayEquals(arr, actual[i])
    }
}