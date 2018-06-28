package main.kotlin

fun Any?.whenNull(action: () -> Unit) {
    if (this === null) {
        action()
    }
}

fun Any?.whenNotNull(action: () -> Unit) {
    if (this != null) {
        action()
    }
}