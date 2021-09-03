import kotlin.math.max

class ProblemD {
    fun main (){
        val count : Int = readInt()
        var count2 : Int
        var inputList : List<Long>
        var out : Long

        for (i in 1..count) {
            count2 = readInt()
            inputList = readListLong().sorted()
            out = 0

            for (i2 in inputList.indices) {
                out = max((count2 - i2) * inputList[i2], out)
            }

            println(out)
        }
    }
}