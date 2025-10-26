package ru.arab.lessons.lesson15.homework.materials

class Task6: Materials() {

    fun sortedAfterAdd(name: String) {
        val materials = (extractMaterials() + name).sorted()
        materials.forEach { addMaterial(it) }
    }
}