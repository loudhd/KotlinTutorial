import android.os.Build
import androidx.annotation.RequiresApi
import com.example.kotlintutorial.*

fun main(arg: Array<String>) {
    /*println("Hello world")
    println("My first Kotlin program")

    val jim = "jame T kirk"
    val tim = "tim Buchalka"
    println(tim)

    val timweeklySalary = 32
    val monthly = timweeklySalary * 4
    println("Tim's weekly salaly is${timweeklySalary}")
    println("monthly, that cones to $monthly ")

    println()

    val apples = 6
    val oranges = 5
    val frult = apples - oranges
    println("$apples apples - $oranges oranges leaves $frult place(s) of fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val week: Int = 128
    val year: Double = week / 52.0
    println("130 weeks in year is : " + year)

    //tim = "jame T kirk "

    println("my name is $tim")
    println("jim is $jim")*/
    /*val lives = 3

    var isGameOver = (lives < 3)
    println(isGameOver)

    if (isGameOver) {
        println("Game over ")
    } else {
        println("you're still slive!")
    }*/

    /*println("How old are you: ")
    val age = readLine()!!.toInt()
    println("Age is $age")

    val massage: String
    massage = when (age < 18) {
        age < 18 -> "You're young to vete"
        age == 100 -> "Congratulations"
        else -> "You can vete"
    }
    /*massage = if (age < 18) {
        "You're young to vete"

    } else if (age == 100) {
        "Congratulations "
    }else{
        "You can vete"

    }*/
    println(massage)*/

  /*  @RequiresApi(Build.VERSION_CODES.N)
    fun main(args: Array<String>) {
        val tim = Player("Tim")
//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)
        tim.show()

        val louise = Player("Louise", 5)
        louise.show()

        val gr8 = Player("gr8", 4, 8)
        val one2watch = Player("Ace",2, 5, 1000)
        gr8.show()
        one2watch.show()
        println(one2watch.weapon.name.toUpperCase())
        println(one2watch.weapon.damageInflicted)

        val axe = Weapon("Axe",12)
        gr8.weapon=axe
        println(gr8.weapon.name)
        println(axe.name)

        axe.damageInflicted = 24
        println(axe.damageInflicted)
        println(gr8.weapon.damageInflicted)

        tim.weapon= Weapon("Sword", 18 )
        //println(tim.weapon.name)
        tim.show()


        louise.weapon  =tim.weapon
        louise.show()
        tim.weapon = Weapon("Spear",14)
        //println(tim.weapon.name)
        tim.show()

        val redPotion = Loot("Red Potion",LootType.POTION,7.50)
        tim.getLoot(redPotion)
        val chestArmor = Loot("+3 Chest Armor",LootType.ARMOR,80.00)
        tim.getLoot(chestArmor)
        tim.showInventory()

        tim.getLoot(Loot("Ring of Protection +2 ",LootType.RING,40.25))
        tim.getLoot(Loot("Invisibility Potiom",LootType.POTION,35.95))
        tim.showInventory()

        if (tim.dropLoot(redPotion)){
            tim.showInventory()
        }else {
            println("You don't heve a ${redPotion.name}")
        }

        val bluePotion = Loot("Blue Potion ",LootType.POTION,6.00)
        if (tim.dropLoot(bluePotion)){
            tim.showInventory()
        }else{
            println("You don't heve ${bluePotion.name}")
        }
         if (tim.dropLoot("Invisibility Potiom")) {
             tim.showInventory()
         }else{
             println("you don't have an Invisibility Potiom")
         }



        /*for (i in 10 downTo 0 step 2){
            println("$i squared is ${i*1}")
        }
        for (value in 3..100 step 3){
            if (value % 5 == 0 ){
                println(value)
            }
        }*/

    }*/
    /*val enemy = Enemy("test enemy",10,3)
    println(enemy)
    enemy.takeDamage(4)
    println(enemy)
    enemy.takeDamage(11)
    println(enemy)*/

    val uglyTroll= Troll("Ugly Troll ")
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)

    val  vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val  dracula = VampyreKing("dracula")
    println(dracula)
    while (dracula.lives> 0) {
        if (dracula.dodges()){
            continue;
        }
        if (dracula.runAwey()){
            println("Dracula run awey ")
            break
        }else{
            dracula.takeDamage(12)
        }
    }
}