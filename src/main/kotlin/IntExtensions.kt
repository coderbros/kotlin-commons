package main.kotlin

/**
 * Executes action if this int is positive.
 */
fun Int.whenPositive(action: () -> Unit) {
    if(this >= 0) {
        action()
    }
}

/**
 * Executes action if this int is negative.
 */
fun Int.whenNegative(action: () -> Unit) {
    if(this < 0) {
        action()
    }
}

/**
 * Executes action if this int is zero.
 */
fun Int.whenZero(action: () -> Unit) {
    if(this == 0) {
        action()
    }
}