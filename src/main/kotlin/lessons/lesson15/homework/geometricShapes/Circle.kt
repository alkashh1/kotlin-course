package ru.arab.lessons.lesson15.homework.geometricShapes

class Circle(
    color: String,
    border: Boolean,
    name: String,
    val radius: Int
): GeometricShape(color, border, name) {

    fun circumferenceLength() {
        println("Окружность = ${radius * 2 * 3.14}")
    }
}