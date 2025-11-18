package ru.arab.lessons.lesson19.homework

import ru.arab.lessons.lesson19.homework.Validator

class ListValidator<Y : Number> : Validator<List<Y?>> {
    override fun validation(element: List<Y?>): Boolean {
        return element.all { it != null && it.toDouble() != 0.0 }

    }
}