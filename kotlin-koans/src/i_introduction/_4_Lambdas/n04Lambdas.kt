package i_introduction._4_Lambdas

import com.google.common.base.Predicate
import com.google.common.collect.Iterables
import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Boolean {
    return Iterables.any(collection) { element -> element!! % 2 == 0 }
}

fun task4(collection: Collection<Int>): Boolean = todoTask4(collection)