class ProblemB {
    fun main (){
        val count : Int = readInt()
        var inputList : List<Int>
        var charCount : Int
        var charCountAppend : Int
        var targetChar : Char
        var out : String

        for (i in 1..count){
            inputList = readListInt()
            charCount = inputList[0] / inputList[1]
            charCountAppend = inputList[0] % inputList[1]
            out = ""
            targetChar = 'a'

            for (i2 in 1..inputList[1]){
                for (i3 in 1..charCount){
                    out += targetChar
                }
                if (charCountAppend > 0){
                    charCountAppend -= 1
                    out += targetChar
                }
                targetChar += 1
            }

            println(out)
        }
    }
}