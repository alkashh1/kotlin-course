package ru.arab.lessons.lesson15.homework

import ru.arab.lessons.lesson15.homework.geometricShapes.Circle
import ru.arab.lessons.lesson15.homework.geometricShapes.Triangle
import ru.arab.lessons.lesson15.homework.materials.Task4
import ru.arab.lessons.lesson15.homework.materials.Task5
import ru.arab.lessons.lesson15.homework.materials.Task6
import ru.arab.lessons.lesson15.homework.materials.Task7

fun main() {

    val circle = Circle("красный", false, "круг", 3)
    val triangle = Triangle("синий", true, "треугольник", 3, listOf(5, 6, 3))

    circle.getName()
    circle.circumferenceLength()

    triangle.getName()
    triangle.getPerimeter()

    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val materials1 = Task4()
    ordinalNumbers.forEach { materials1.addMaterial(it) }
    materials1.AddMaterialsFirst("null")
    println(materials1.extractMaterials())

    val materials2 = Task5()
    ordinalNumbers.forEach { materials2.addMaterial(it) }
    materials2.addList(listOf("строка1", "строка2"))
    println(materials2.extractMaterials())

    val materials6 = Task6()
    ordinalNumbers.forEach { materials6.addMaterial(it) }
    materials6.sortedAfterAdd("строка1")
    println(materials6.extractMaterials())

    val materials7 = Task7()
    ordinalNumbers.forEach { materials7.addMaterial(it) }
    materials7.addMap(mapOf("1" to "один", "2" to "два"))
    println(materials7.extractMaterials())
}