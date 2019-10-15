package com.example.kotlintutorial

class Enemy (val  name:String,var hitPointa:Int,var lives:Int){
    fun takeDamage(damage:Int){
        val remainingHiPoints = hitPointa- damage
        if (remainingHiPoints > 0){
            hitPointa= remainingHiPoints
            println("$name took $damage points of damage,and has $hitPointa lsft ")
        }else{
            lives-=1
            println("$name lest a lift")
        }
    }
}