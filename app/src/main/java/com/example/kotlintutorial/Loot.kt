package com.example.kotlintutorial

import kotlin.reflect.typeOf

enum class LootType {
    POTION, RING, ARMOR
}
class Loot (val name: String,val Type: LootType,val  value: Double){

    override fun toString(): String {
        return "$name is $Type and is worth $value"
    }
}