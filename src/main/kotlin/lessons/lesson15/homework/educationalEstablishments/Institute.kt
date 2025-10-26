package ru.arab.lessons.lesson15.homework.educationalEstablishments

open class Institute(
    name: String,
    yearOfFoundation: Int,
    val rating: Double
): EducationEstablishment(name, yearOfFoundation)  {
}