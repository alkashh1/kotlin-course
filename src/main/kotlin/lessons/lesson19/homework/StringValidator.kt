package ru.arab.lessons.lesson19.homework

import ru.arab.lessons.lesson19.homework.Validator

class StringValidator : Validator<String?> {
    override fun validation(element: String?): Boolean {
        if (element != null) {
            return element.isNotBlank()
        } else {
            return false
        }
    }
}