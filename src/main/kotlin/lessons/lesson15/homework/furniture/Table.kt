package ru.arab.lessons.lesson15.homework.furniture

class Table(
    name: String,
    material: String,
    color: String,
    val size: String
) : Kitchen(name, material, color) {
}