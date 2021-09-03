class ProblemC {
    fun main (){
        val count : Int = readInt()
        val inputList : List<Int> = readListInt().sortedDescending()
        var out = 0

        for (i in 0 until count step 2) {
            out += inputList[i] - inputList[i + 1]
        }
        println(out)
    }
}