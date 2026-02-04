
val SET_VOWEL = setOf<Char>('a', 'e', 'i', 'o', 'u')
fun String.ftCountVowels(): Int {
    println(this)
    var count = 0
    for(char in this){
        if(SET_VOWEL.contains(char.lowercaseChar())){
            count++
        }
    }
    println(count)
    return count
}

fun String.ftIsPalindrome(): Boolean {
    // two pointer while loop
    val SET_SPECIAL_CHARACTERS = setOf(',', ':',)
    val target = this.filter { !SET_SPECIAL_CHARACTERS.contains(it) }.filter{ it.isLetter()}
    var cLeft = 0
    var cRight = target.length - 1

    while(cLeft < cRight) {
        // confirm cLeft and cRight = eachother
        // if they don't equal eachother return false

        if(target[cLeft].lowercaseChar() === target[cRight].lowercaseChar()){
            cLeft++
            cRight--
        } else {
            return false
        }
    }

    return true
}

fun String.ftToTitleCase(): String {
     val target = this.trim()
    var split = target.split(" ")

    split = split.filter { it.isNotEmpty() }
    val stringBuilder = StringBuilder()

    for((index, string) in split.withIndex()) {
        val upperCaseChar = string[0].uppercase()
        val rest = string.substring(1)
        stringBuilder.append(upperCaseChar.plus(rest))
        if(index != (split.size - 1)) {
            stringBuilder.append(" ")
        }
    }

    return stringBuilder.toString()
}