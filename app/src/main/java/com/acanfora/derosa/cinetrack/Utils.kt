package com.acanfora.derosa.cinetrack

fun capitalizeWords(text: String): String {
    return text.split(" ").joinToString(" ") { it.replaceFirstChar { it.uppercase() } }
}