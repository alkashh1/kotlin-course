package ru.arab.lessons.lesson19.homework

import ru.arab.lessons.lesson19.homework.Validator

class OddValidator : Validator<Int> {
    override fun validation(element: Int): Boolean {
        return element % 2 == 0
    }
}