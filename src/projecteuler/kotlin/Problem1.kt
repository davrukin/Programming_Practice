package projecteuler.kotlin

/**
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1 {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val numbers = mutableListOf<Int>()

            var i = 0
            while (i < 1000) {
                if ((i % 3 == 0) || (i % 5 == 0)) {
                    numbers.add(i)
                }
                i++
            }

            println("sum: ${numbers.sum()}")
        }
    }

}