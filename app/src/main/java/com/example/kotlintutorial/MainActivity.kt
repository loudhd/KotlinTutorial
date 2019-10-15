import com.example.kotlintutorial.Player

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
    }

}