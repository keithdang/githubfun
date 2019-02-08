fun main(args: Array<String>){
    mapBranch()
//    helloWorld()
//    fizzbuzz(20)
}

fun helloWorld(){
    println("Hello World")
    println("Hello World4")
    println("Hello Fish")
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
    tempList.mapTo(myList) {it*2}
//    mapToResult.forEach { print("$it,") }
    myList.forEach { print("$it,") }
}