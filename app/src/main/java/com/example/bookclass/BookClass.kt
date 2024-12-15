package com.example.bookclass

fun main() {
    val defaultBook = Book("Default Title", "Default Author", 2023)
    println("${defaultBook.title}, written by ${defaultBook.author}, published in ${defaultBook.yearPublished}")


    val customBook = Book("1984", "George Orwell", 1949)
    println("${customBook.title}, written by ${customBook.author}, published in ${customBook.yearPublished}")
}

class Book(var title: String, var author: String, var yearPublished: Int) {
    init {
        println("Book created: $title by $author, published in $yearPublished")
    }
}
