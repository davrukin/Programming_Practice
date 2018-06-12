package shiftedup.kotlin

import kotlin.reflect.jvm.internal.ReflectProperties

/**
 * https://www.shiftedup.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 */
class FiveProblems {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            FiveProblems().problem1()
            FiveProblems().problem2()
            FiveProblems().problem3()
            FiveProblems().problem4()
            FiveProblems().problem5()
        }
    }

    /**
     * Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion.
     */
    fun problem1() {
        val list = arrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25)

        var sum = 0
        for (item in list) {
            sum += item
        }
        println("for loop sum: $sum")

        sum = 0
        var i = 0
        while (i < list.size) {
            sum += list[i]
            i++
        }
        println("while loop sum: $sum")


    }

    /**
     * Write a function that combines two lists by alternatingly taking elements.
     * For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].
     */
    fun problem2() {
        val letters = arrayListOf('a', 'b', 'c', 'd', 'e', 'f', 'g')
        val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7)
        val newList = arrayListOf<Any>()

        var i = 0
        when {
            letters.size < numbers.size -> {
                while (i < letters.size) {
                    newList.add(letters[i])
                    newList.add(numbers[i])
                    i++
                }
                while (i < numbers.size) {
                    newList.add(numbers[i])
                    i++
                }
            }
            letters.size > numbers.size -> {
                while (i < numbers.size) {
                    newList.add(letters[i])
                    newList.add(numbers[i])
                    i++
                }
                while (i < letters.size) {
                    newList.add(letters[i])
                    i++
                }
            }
            else -> while (i < letters.size) {
                newList.add(letters[i])
                newList.add(numbers[i])
                i++
            }
        }

        println("newList: $newList")
    }

    /**
     * Write a function that computes the list of the first 100 Fibonacci numbers.
     * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
     * As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
     */
    fun problem3() {

    }

    /**
     * Write a function that given a list of non negative integers, arranges them such that they form the largest possible number.
     * For example, given [50, 2, 1, 9], the largest formed number is 95021.
     * Update: Apparently this problem got a lot of people talking (although not as much as Problem 5 below.)
     * [You can click here to read my solution.](https://www.shiftedup.com/2015/05/08/solution-to-problem-4)
     */
    fun problem4() {

    }

    /**
     * Write a program that outputs all possibilities to put + or - or nothing between the numbers 1, 2, ..., 9 (in this order)
     * such that the result is always 100. For example: 1 + 2 + 34 – 5 + 67 – 8 + 9 = 100.
     * Update: [(Here is one solution to this problem in case you are curious.)](https://www.shiftedup.com/2015/05/08/solution-to-problem-5-and-some-other-thoughts-about-this-type-of-questions)
     */
    fun problem5() {

    }

}