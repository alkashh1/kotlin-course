package ru.arab.lessons.lesson19.homework

interface Validator<R> {
    fun validation(element: R): Boolean

}