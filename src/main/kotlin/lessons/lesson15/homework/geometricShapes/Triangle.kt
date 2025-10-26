package ru.arab.lessons.lesson15.homework.geometricShapes

class Triangle(
    color: String,
    border: Boolean,
    name: String,
    numberOfCorners: Int,
    sides: List<Int>
) : Polygon(color, border, name, numberOfCorners, sides) {
}