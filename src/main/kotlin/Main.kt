fun main(){
    println("Enter your CGP:")
    val cgp = readlnOrNull()?.toFloat()
    if ( cgp != null){
        when{
            cgp >= 4.4 -> println("FIRST CLASS")
            cgp >= 3.6 -> println("SECOND CLASS UPPER")
            cgp >= 2.7 -> println("SECOND CLASS LOWER")
            cgp >= 2.1 -> println("PASS")
            else -> println("GRADE F. you need help")
        }
    }else{
        println("Invalid cgp entered" )
    }
}
