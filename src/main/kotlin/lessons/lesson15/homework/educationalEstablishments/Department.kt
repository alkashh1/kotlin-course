package ru.arab.lessons.lesson15.homework.educationalEstablishments

class Department(
    name: String,
    yearOfFoundation: Int,
    rating: Double,
    val directions: MutableList<String>
) : Institute(name, yearOfFoundation, rating) {
}