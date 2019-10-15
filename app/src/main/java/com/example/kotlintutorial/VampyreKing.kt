package com.example.kotlintutorial

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
}