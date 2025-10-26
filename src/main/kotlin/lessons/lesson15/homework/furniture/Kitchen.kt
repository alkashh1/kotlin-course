package ru.arab.lessons.lesson15.homework.furniture

open class Kitchen(
    name: String,
    material: String,
    val color: String
) : Furniture(name, material) {
}