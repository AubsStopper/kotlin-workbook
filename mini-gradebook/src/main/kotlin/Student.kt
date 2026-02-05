package me.aubsled.workbook

class Student(val name: String) {
    private val scores = mutableListOf<Int>()

    fun addScore(score: Int) {
        if(score in 0..100){
            scores.add(score)
        } else {
            throw IllegalArgumentException("Student::addScore: your score does not fit in range of scores 0 to 100")
        }

    }

    fun average(): Double {
        val total = scores.reduce {
            runningTotal, score -> runningTotal + score
        }
        return (total / scores.size).toDouble()
    }

    fun letterGrade(): Char {
      return when(average().toInt()){
                in 90 ..100 -> 'A'
                in 80 ..89 -> 'B'
                in 70 ..79 -> 'C'
                in 60 ..69 -> 'D'
                else -> 'F'
        }
    }

}