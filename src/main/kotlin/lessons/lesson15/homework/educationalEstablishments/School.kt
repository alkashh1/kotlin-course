package ru.arab.lessons.lesson15.homework.educationalEstablishments

class School(
    name: String,
    yearOfFoundation: Int,
    val shape: String
): EducationEstablishment(name, yearOfFoundation) {
}