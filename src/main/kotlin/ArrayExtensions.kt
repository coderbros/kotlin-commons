package main.kotlin

inline fun <T> print2DArray(twoDArray: Array<Array<T>>) {
    for (i in 0 until twoDArray.size) {
        for (j in 0 until twoDArray[i].size) {
            print(twoDArray[i][j])
            if (j != twoDArray[i].size - 1) print(" ")
        }
        if (i != twoDArray.size - 1) println()
    }
}


inline fun <T> print1DArray(twoDArray: Array<T>) {
    for (i in 0 until twoDArray.size) {
        print("${twoDArray[i]}")
        if (i != twoDArray.size - 1) print(" ")
    }
}

fun <T> Array<T>.isEvery(action: (T) -> Boolean): Boolean {
    for (element in this) {
        if (!action(element)) {
            return false
        }
    }
    return true
}

fun <T> Array<T>.isSome(action: (T) -> Boolean): Boolean {
    for (element in this) {
        if (action(element)) {
            return true
        }
    }
    return false
}