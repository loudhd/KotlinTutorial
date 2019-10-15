package com.example.kotlintutorial

open class Enemy (val  name:String, var hitPointa:Int, var lives:Int){
    fun takeDamage(damage:Int){
        val remainingHiPoints = hitPointa- damage
        if (remainingHiPoints > 0){
            hitPointa= remainingHiPoints
            println("$name took $damage points of damage,and has $hitPointa lsft ")
        }else{
            lives-=1
            if (lives>0){
                println("$name lost a lift")
            }else{
                println("No lives left,$name is dead")
            }
            println("$name lest a lift")
        }
    }

    override fun toString(): String {
        return "Name: $name , Hitpoints $hitPointa, Lives : $lives"
    }
}