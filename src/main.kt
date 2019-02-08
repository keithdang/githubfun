fun main(args: Array<String>){
  println("main")
  mapBranch()
}

fun helloWorld(){
    println("Hello World")
    println("Hello World4")
    println("Hello Fish")
    println("Hello Cat")
}

fun fizzbuzz(num:Int){
    for(i in 0 until num){
        when{
            i % 3 == 0 && i % 5 == 0 -> println("fizzbuzz")
            i % 3 == 0 -> println("fizz")
            i % 5 == 0 -> println("buzz")
            else -> println(i)
        }
    }
}

fun mapBranch(){
    val myList = ArrayList<Int>()
    val tempList = listOf(1,2,3)
    tempList.filter { it % 2 != 0 }.mapTo(myList) { it * 2 }
    myList.forEach { print("$it,") }
}