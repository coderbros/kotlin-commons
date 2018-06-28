package main.kotlin

/**
 * Executes action if this string is empty or consists solely of whitespace characters.
 */
fun String.whenBlank(action: () -> Unit) {
    if(this.isBlank()) {
        action()
    }
}

/**
 * Executes action if this string is not consists of solely whitespace characters.
 */
fun String.whenNotBlank(action: () -> Unit) {
    if(!this.isBlank()) {
        action()
    }
}

/**
 * Executes action if this string is not consists of solely whitespace characters and starts with space.
 */
fun String.whenWhiteSpacesAtBeginning(action: () -> Unit) {
    if(!this.isBlank() && this.startsWith(" ")) {
        action()
    }
}

/**
 * Executes action if this string is not consists of solely whitespace characters and ends with space.
 */
fun String.whenWhiteSpacesAtEnd(action: () -> Unit) {
    if(!this.isBlank() && this.endsWith(" ")) {
        action()
    }
}

/**
 * Executes action if this char sequence is empty (contains no characters).
 */
fun String.whenEmpty(action: () -> Unit) {
    if(this.isEmpty()) {
        action()
    }
}