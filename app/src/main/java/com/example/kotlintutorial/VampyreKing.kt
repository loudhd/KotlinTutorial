package com.example.kotlintutorial

import kotlin.random.Random


class VampyreKing (name: String) : Vampyre(name) {
    init {
        hitPointa= 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
    }
    fun runAwey():Boolean{
        return lives<2
    }
    fun dodges():Boolean{
        val rand = Random()
        val chance = rand.nextInt(6)
        if (chance> 3 ){
            println("Dracula dodges")
            return true
        }
        return false
    }
}