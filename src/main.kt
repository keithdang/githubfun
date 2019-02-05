fun main(args: Array<String>){
    helloWorld()
    fizzbuzz(20)
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