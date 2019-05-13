package intro
fun main(args:Array<String>){
    val name = if (args.size>0)
        args[0]
    else
        "Kotlin"
                println("Hello,$name" )
    val question:String=
            "life, the universe," + "and everything"
    println("$question?")

    var answer=0
    answer=42
    println(answer)
}