package ru.arab.lessons.lesson15.homework.materials

class Task4 : Materials() {

    fun AddMaterialsFirst(name: String){
        val materials = extractMaterials()
        addMaterial(name)
        materials.forEach { addMaterial(it) }
    }
}