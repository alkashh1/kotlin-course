package ru.arab.lessons.lesson14.homework

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Место проведения: $location")
        println("Кол-во гостей:: $attendees")
    }
}