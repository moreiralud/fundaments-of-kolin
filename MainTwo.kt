fun main(args:Array<String>) {
    println(checkBehaviorOfMethodAny())
}

fun checkBehaviorOfMethodAny(): Boolean{
    try {
        val animals =  listOf("Migson","Cida")
        val listOfIndexes: List<Int> = listOf(0,1,2,3)

        return listOfIndexes.any { animals[it].isNotEmpty() }
    } catch (e: IndexOutOfBoundsException) {
        println("Entrou na exception: " + e.message)
        return false
    }
}