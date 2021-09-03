class ProblemA {
    fun main (){
        val count : Int = readInt()
        var inputList : List<Int>
        var toRight: Int
        var toLeft : Int
        var iteration : Int
        var x : Long

        for (i in 1..count){
            inputList = readListInt()
            toRight = inputList[0]
            toLeft = inputList[1]
            iteration = inputList[2]

            x = (toRight - toLeft).toLong() * (iteration / 2)
            if (iteration % 2 == 1) {
                x += toRight
            }
            println(x)
        }
    }
}