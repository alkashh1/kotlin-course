package ru.arab.lessons.lesson15.homework.geometricShapes

open class GeometricShape(
    val color: String,
    val border: Boolean,
    val name: String
) {
    open fun getName() {
        println(name)
    }
}