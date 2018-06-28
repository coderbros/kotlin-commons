package main.kotlin

/**
 * Executes action if this nullable is null
 */
fun Any?.whenNull(action: () -> Unit) {
    if (this === null) {
        action()
    }
}

/**
 * Executes action if this nullable is non null
 */
fun Any?.whenNotNull(action: () -> Unit) {
    if (this != null) {
        action()
    }
}