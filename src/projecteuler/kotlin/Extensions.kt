package projecteuler.kotlin

fun MutableList<Int>.evens(): MutableList<Int> {
    val newList = mutableListOf<Int>()

    this.forEach {
        if (it.isEven()) {
            newList.add(it)
        }
    }

    return newList
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}
