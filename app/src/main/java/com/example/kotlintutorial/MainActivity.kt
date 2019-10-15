fun main(arg:Array<String>){
    println("Hello world")
    println("My first Kotlin program")


    var tim: String
    tim = "tim Buchalka"
    println(tim)

    var timweeklySalary : Int= 32
    var monthly : Int = timweeklySalary * 4
    println(timweeklySalary)
    println(monthly)

    println()

    val apples: Int = 6
    val oranges: Int = 5
    var  frult : Int = apples - oranges
    println(frult)

    println("A quarter of the apples is ${apples / 4}")

    println()
    val week: Int = 128
    val  year: Double = week / 52.0
    println("130 weeks in year is : " + year)

    println("my name is $tim")
}